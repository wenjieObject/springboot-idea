package com.boway.platemes.controller;

import com.boway.platemes.service.userAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userauth")
public class userAuthController {

    @Autowired
    private userAuthService userAuthService;

    @GetMapping("/test")
    public void Test()  {
        userAuthService.test();
    }
}
