package com.boway.platemes.controller;

import com.boway.platemes.pojo.ResultVO;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomErrorController implements ErrorController {
    @Override
    public String getErrorPath() {
        return "/error";
    }


    @RequestMapping("/error")
    public ResultVO handleError(HttpServletRequest request, HttpServletResponse response) {
        return new ResultVO(response.getStatus(), (String) request.getAttribute("javax.servlet.error.message"), null);

    }
}
