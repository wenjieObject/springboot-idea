package com.boway.platemes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class redisController {

    //@Autowired
    //private RedisUtil redisUtil;

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @GetMapping("/test")
    public void test2() {

        redisTemplate.opsForValue().set("myKey","myValue");
        redisTemplate.delete("myKey");
        System.out.println(redisTemplate.opsForValue().get("myKey"));

//        boolean isHas= redisUtil.hasKey("Digiwin");
//        if(isHas){
//            Object digiwin = redisUtil.get("Digiwin");
//            String s = digiwin.toString();
//        }

    }

}
