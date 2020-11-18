package com.boway.platemes.mq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author
 * @function
 * @email
 * @date 2020/4/28  7:20 PM
 * @RabbitListener 自定义监听事件
 * @QueueBinding 绑定交换器与队列的关系value 指定队列exchange指定交换器
 * value= @Queue 指定配置队列的信息 value队列名称 autoDelete是否是临时队列
 * exchange= @Exchange 指定交换器 value指定交换器名称 type交换器类型
 * key  指定路由键
 */
@Component
@Slf4j
@RabbitListener(
        bindings = @QueueBinding(
                value = @Queue(value = "${mq.config.queue.errorName}", autoDelete = "true"),
                exchange = @Exchange(value = "${mq.config.exchange}", type = ExchangeTypes.TOPIC),
                key = "${mq.config.queue.routingErrorKey}")
)
public class ErrorReceiver {

    /**
     * 设置监听方法
     *  @RabbitHandler 声明监听方法是下面的 isDefault属性是默认false接受的完整对象，true接受body体
     *
     * @param msg
     */
    @RabbitHandler(isDefault = true)
    public void process(String msg) {
        log.info("接受到消息：error {}", msg);
    }
}
