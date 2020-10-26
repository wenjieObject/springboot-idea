package com.boway.platemes.controller;

import com.boway.platemes.service.factoryBasService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/factoryBas")
public class factoryBasController {

    @Autowired
    factoryBasService factoryBasService;

    //Logger logger= LoggerFactory.getLogger(Logger.class);

    @GetMapping("/test")
    public String test() {

        log.trace("this is trace");
        log.debug("this is debug");
        log.info("this is info");
        log.warn("this is warn");
        log.error("this is error");
        return factoryBasService.Test();
    }

    @GetMapping("/test2")
    public String test2(){

        int i=0;
        int s=100/i;

        return "0";
    }
}
