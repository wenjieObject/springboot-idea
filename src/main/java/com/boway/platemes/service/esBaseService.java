package com.boway.platemes.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Slf4j
@Service
public class esBaseService {

    @Autowired
    @Qualifier(value = "restHighLevelClient")
    private RestHighLevelClient client;

    public String getDocById(String id){

        // 1.构建GetRequest请求对象,指定索引库、类型、id
        GetRequest getRequest = new GetRequest("primeton_esb_log_202010", "_doc", id);
        String result="";
        try {
            // 2.调用方法进行数据通信
            GetResponse getResponse = client.get(getRequest, RequestOptions.DEFAULT);
            // 3.解析输出结果
            result= JSON.toJSONString(getResponse);
            log.info(result);
            //System.out.println("结果：" + JSON.toJSONString(getResponse));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return  result;
    }


    public void matchDoc() {
        // 1.构建SearchRequest请求对象,指定索引库
        SearchRequest searchRequest = new SearchRequest("primeton_esb_log_202010");

        // 2.构建SearchSourceBuilder查询对象
        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();

        // 3.构建QueryBuilder对象指定查询方式和查询条件
        //QueryBuilder queryBuilder = QueryBuilders.matchQuery("0.payload", "c53e8886-4b71-c078-fce0-7975397e37fc");

        QueryBuilder queryBuilder = QueryBuilders.boolQuery().
                must(QueryBuilders.matchQuery("0.payload", "c53e8886-4b71-c078-fce0-7975397e37fc")).
                must( QueryBuilders.rangeQuery("0.timestamp")
                        .from("1990-01-01")
                        .to("2020-12-31")
                        .format("yyyy-MM-dd"));
                //matchQuery("0.payload", "c53e8886-4b71-c078-fce0-7975397e37fc");

        //QueryBuilders.
        // 4.将QueryBuilder对象设置到SearchSourceBuilder中
        sourceBuilder.query(queryBuilder);

        sourceBuilder.from(0);
        sourceBuilder.size(1);
        // 5.将SearchSourceBuilder对象封装到请求对象SearchRequest中
        searchRequest.source(sourceBuilder);

        try {
            // 6.调用方法进行数据通信
            SearchResponse searchResponse = client.search(searchRequest, RequestOptions.DEFAULT);
            // 7.解析输出结果
            SearchHit[] hits = searchResponse.getHits().getHits();
            for (SearchHit hit : hits) {
                String sourceAsString = hit.getSourceAsString();

                //把接送字符串解析成json对象进行操作
                JSONObject jb = JSONObject.parseObject(sourceAsString);
                //取“value”的键值，value里面是个json数组
                Object jsonArray = jb.getJSONObject("0");
                //把json数组转为json字符串
                String jsonString = JSONObject.toJSONString(jsonArray);

                log.info(jsonString);
                System.out.println("结果： " + jsonString);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
