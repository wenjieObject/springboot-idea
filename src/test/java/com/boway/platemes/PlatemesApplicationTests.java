package com.boway.platemes;


import com.boway.platemes.pojo.UserEntity;
import com.boway.platemes.util.RedisUtil;
import org.elasticsearch.client.RestHighLevelClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlatemesApplicationTests {

    @Autowired
    @Qualifier(value = "restHighLevelClient")
    private RestHighLevelClient client;


    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    RedisUtil redisUtil;



    @Test
    public void testInsert(){

        UserEntity userEntity=new UserEntity("user","pwd",null);
        redisUtil.set("user",userEntity);
        System.out.println(redisUtil.get("user"));
        boolean isTrue= redisUtil.set("springboot","value");

        if(isTrue){
            boolean isHas = redisUtil.hasKey("springboot");
            if(isHas){
                Object springboot = redisUtil.get("springboot");

                if(springboot!=null){
                    System.out.println(springboot.toString());
                }

            }

        }

    }


    @Test
   public void contextLoads() {

        redisTemplate.delete("myKey");

        // 1.构建GetRequest请求对象,指定索引库、类型、id
//        GetRequest getRequest = new GetRequest("primeton_esb_log_202010", "_doc"
//                , "9f3880b0-0e8d-11eb-835c-286ed48a0067");
//        try {
//
////            RestHighLevelClient client= new RestHighLevelClient(
////                    RestClient.builder(
////                            new HttpHost("10.60.4.136", 9200, "http")));
//            // 2.调用方法进行数据通信
//            GetResponse getResponse = client.get(getRequest, RequestOptions.DEFAULT);
//            // 3.解析输出结果
//            System.out.println("结果：" + JSON.toJSONString(getResponse));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

}
