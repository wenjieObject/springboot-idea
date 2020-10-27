package com.boway.platemes.controller;


import com.boway.platemes.service.esBaseService;
import com.boway.platemes.service.factoryBasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/esbase")
public class esBaseController {

    @Autowired
    esBaseService esBaseService;


    @GetMapping("/test")
    public String test() {
        return esBaseService.getDocById("c3f96330-0e22-11eb-8467-286ed48a2247");
    }


    @GetMapping("/test2")
    public void test2() {
         esBaseService.matchDoc();
    }
}
