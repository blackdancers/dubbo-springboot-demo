package com.chickencc.dubbo.service;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@EnableDubboConfiguration
@SpringBootApplication
public class DubboSpringbootConsumerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DubboSpringbootConsumerApplication.class, args);
        QuickConsumer quickConsumer = context.getBean("quickConsumer", QuickConsumer.class);
        String s = quickConsumer.sayHello("张三");
        System.out.println(s);
    }
}
