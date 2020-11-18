package com.boway.platemes.controller;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
//监听队列kinson
@RabbitListener(queues = {"wenjie"})
public class MyReceiver1 {

    @RabbitHandler
    public void receiver(Object msg) {
        System.out.println("MyReceiver1 :" + msg.toString());
    }
}
