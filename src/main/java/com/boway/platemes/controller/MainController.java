package com.boway.platemes.controller;

import com.boway.platemes.pojo.ResultVO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String hotBuild(){
        return "hello world hot build";
    }

    @GetMapping("/hb")
    public String hotBuild2(){
        return "hello world hot build";
    }
//    @PostMapping("login")
//    public String login(String username,String password){
//
//        if(username.equals("smith")){
//            return "登录成功";
//        }
//        return "登录失败";
//    }

    // 任何人都可以访问，在方法中判断用户是否合法
    @GetMapping("everyone")
    public ResultVO everyone() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            // 登入用户
            return new ResultVO(HttpStatus.OK.value(), "You are already login", authentication.getPrincipal());
        } else {
            return new ResultVO(HttpStatus.OK.value(), "You are anonymous", null);

        }
    }




    @GetMapping("user")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public ResultVO user(@AuthenticationPrincipal UsernamePasswordAuthenticationToken token) {
        return new ResultVO(HttpStatus.OK.value(), "You are user", token);
    }

    @GetMapping("admin")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public ResultVO admin(@AuthenticationPrincipal UsernamePasswordAuthenticationToken token) {

        System.out.printf(token.toString());
        return new ResultVO(HttpStatus.OK.value(), "You are admin", token);
    }

}
