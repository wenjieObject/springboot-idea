package com.boway.platemes;


import com.alibaba.fastjson.JSON;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class PlatemesApplicationTests {

    @Autowired
    @Qualifier(value = "restHighLevelClient")
    private RestHighLevelClient client;

    @Test
    void contextLoads() {

        // 1.构建GetRequest请求对象,指定索引库、类型、id
        GetRequest getRequest = new GetRequest("primeton_esb_log_202010", "_doc"
                , "9f3880b0-0e8d-11eb-835c-286ed48a0067");
        try {

//            RestHighLevelClient client= new RestHighLevelClient(
//                    RestClient.builder(
//                            new HttpHost("10.60.4.136", 9200, "http")));
            // 2.调用方法进行数据通信
            GetResponse getResponse = client.get(getRequest, RequestOptions.DEFAULT);
            // 3.解析输出结果
            System.out.println("结果：" + JSON.toJSONString(getResponse));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
