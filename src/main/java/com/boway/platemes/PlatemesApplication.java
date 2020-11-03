package com.boway.platemes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class PlatemesApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatemesApplication.class, args);
    }

}
