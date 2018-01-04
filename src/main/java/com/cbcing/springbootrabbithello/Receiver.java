package com.cbcing.springbootrabbithello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 创建消息消费者
 * 通过@RabbitListener对hello队列进行监听
 */
@Slf4j
@Component
@RabbitListener(queues = "hello")
public class Receiver {

    /**
     * 使用@RabbitHandler注解来指定对消息的处理方法
     * @param hello
     */
    @RabbitHandler
    public void process(String hello) {
        log.info("Receiver : " + hello);
    }

}
