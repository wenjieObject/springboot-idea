## 1.入门

```
graph LR
P-->X
X-->queen1
X-->queen2
```

P- 生产者 ，X交换机，queen管道，生产发送消息到交换机，交换机根据策略发送到不同的管道。


## 2.windows安装

https://www.cnblogs.com/nongzihong/p/11578255.html


## 3.springboot使用rabbitmq

### 3.1.pom中添加坐标

```
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-amqp</artifactId>
        </dependency>
```

### 3.2.yml配置连接和队列交换机等

```
  rabbitmq:
    host: localhost
    port: 5672
    username: guest
    password: guest
    publisher-returns: true
    listener:
      direct:
        acknowledge-mode: manual
      simple:
        acknowledge-mode: manual

# 自定义配置应用于topic交换器
mq:
  config:
    #自定义交换器名称
    exchange: log.topic
    queue:
      #自定义error、info、all队列名称
      errorName: topic.error.log
      infoName: topic.info.log
      allName: topic.all.log
      #自定义error、info、all路由键的名称
      routingInfoKey: topic.info.routing.key
      routingErrorKey: topic.error.routing.key

```

### 3.3.代码配置队列

这个配置与yml中配置队列是一样的

```
@Configuration
public class RabbitMqConfig {

    @Bean
    public Queue kinsonQueue() {
        return new Queue("wenjie");
    }
}
```

### 3.4.生产者代码

简单模式的生产者 生产者-->队列--->消费者

```
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
```

topic模式，订阅发布模式 生产者-->交换机-->队列-->消费者

```
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

```

### 3.5.消费者代码

简单模式消费者

```
@Component
//监听队列kinson
@RabbitListener(queues = {"wenjie"})
public class MyReceiver1 {

    @RabbitHandler
    public void receiver(Object msg) {
        System.out.println("MyReceiver1 :" + msg.toString());
    }
}
```

接收所有队列消费者key

```
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
```

其他消费者1

```
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

```

其他消费者2

```
@Component
@Slf4j
@RabbitListener(
        bindings = @QueueBinding(
                value = @Queue(
                        value = "${mq.config.queue.infoName}", autoDelete = "true"
                ),
                exchange = @Exchange(
                        value = "${mq.config.exchange}", type = ExchangeTypes.TOPIC),
                key = "${mq.config.queue.routingInfoKey}")
)
public class InfoReceiver {

    /**
     * 设置监听方法
     *
     * @param msg
     * @RabbitHandler 声明监听方法是下面的 isDefault属性是默认false接受的完整对象，true接受body体
     */
    @RabbitHandler(isDefault = true)
    public void process(String msg) {
        log.info("接受到消息：info {}", msg);
    }
}
```

### 3.5.消息丢失和死循环

1.autoDelete属性设置为false

@Queue(value = "${mq.config.queue.orderName}", autoDelete = "false"

2.死循环

```
#开启重试
spring.rabbitmq.listener.retry.enable=true
#重试次数,默认3次
spring.rabbitmq.listener.retry.max-attempts=5
```
