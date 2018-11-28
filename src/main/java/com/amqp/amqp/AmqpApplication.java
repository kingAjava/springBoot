package com.amqp.amqp;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 自动配置
 * 1、RabbitAutoConfiguration
 * 2、自动配置了连接工厂：connectionFactory
 * 3、RabbitProperties封装了RabbitMQ的配置
 * 4、RabbitTemplate：发送和接受消息
 * 5、AmqpAdmin：系统管理功能组件
 * AmqpAdmin：帮助创建和删除 Queue，Exchange，Binding
 * 6、@EnableRabbit+@RabbitListener监听消息队列的内容
 */

@EnableRabbit
@SpringBootApplication
public class AmqpApplication {


    public static void main(String[] args) {
        SpringApplication.run(AmqpApplication.class, args);
    }
}
