package com.boway.platemes.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.boway.platemes.service.userAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/userauth")
public class userAuthController {

    @Autowired
    private userAuthService userAuthService;

    @GetMapping("/test")
    public void Test()  {
        userAuthService.test();
    }


    @PostMapping("/authorize")
    public String  authorize(@RequestBody String jsonStr)  {

        JSONObject jsonObject= JSON.parseObject(jsonStr); //将jsonStr转化为JSONObject,再进行取值
        String groupCode = jsonObject.getString("groupCode");
        String roleCode = jsonObject.getString("roleCode");
        String permissionCode = jsonObject.getString("permissionCode");

        List<String> users=new ArrayList<>();
        users.add("B152281");
        return userAuthService.authorizeFunc(groupCode, roleCode, permissionCode, users,  null);
    }
}
