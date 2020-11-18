package com.boway.platemes.mq;


import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RabbitListener(
        bindings = @QueueBinding(
                value = @Queue(
                        value = "${mq.config.queue.allName}", autoDelete = "true"
                ),
                exchange = @Exchange(
                        value = "${mq.config.exchange}", type = ExchangeTypes.TOPIC),
                key = "*.*.routing.*")
)
public class AllReceiver {

    /**
     * 设置监听方法
     *
     * @param msg
     * @RabbitHandler 声明监听方法是下面的 isDefault属性是默认false接受的完整对象，true接受body体
     */
    @RabbitHandler(isDefault = true)
    public void process(String msg) {
        log.info("接受到消息：all {}", msg);
    }

}
