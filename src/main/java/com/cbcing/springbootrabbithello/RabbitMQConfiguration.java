package com.cbcing.springbootrabbithello;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 创建RabbitMQ的配置类
 */
@Configuration
public class RabbitMQConfiguration {
    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }
}
