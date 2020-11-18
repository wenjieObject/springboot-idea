package com.boway.platemes.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mq")
public class mqController {

    @Autowired
    private AmqpTemplate amqpTemplate;
    /**
     * 单条消息发送给单个队列，该队列只有一个消费者
     *
     * @return
     */
    @GetMapping(value = "send")
    public String send() {
        String content = "Date:" + System.currentTimeMillis();

        //发送默认交换机对应的的队列kinson
        amqpTemplate.convertAndSend("wenjie", content);
        return content;
    }

    /**
     * spring整合的操作类
     * Message 发送的消息对象
     * void send(Message var1) throws AmqpException;
     * <p>
     * var1 路由键 Message 发送的消息对象
     * void send(String var1, Message var2) throws AmqpException;
     * <p>
     * var1 指定交换器名称 var2 路由键 Message 发送的消息对象
     * void send(String var1, String var2, Message var3) throws AmqpException;
     *
     * convertAndSend() 方法不需要指定MessageProperties属性即可发布
     */
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${mq.config.queue.routingInfoKey}")
    private String routingInfoKey;
    @Value("${mq.config.queue.routingErrorKey}")
    private String routingErrorKey;
    @Value("${mq.config.exchange}")
    private String exchange;

    @GetMapping("sendtopic")
    public void send(String msg) {
        //需要指定交换器和路由键就可以转发
        rabbitTemplate.convertAndSend(exchange, routingInfoKey, "info+"+msg);
        rabbitTemplate.convertAndSend(exchange, routingErrorKey,"error+"+ msg);
        rabbitTemplate.convertAndSend(exchange, "topic.order.routing.key","order+"+ msg);
        rabbitTemplate.convertAndSend(exchange, "topic.warn.routing.key", "warn+"+msg);
    }

}
