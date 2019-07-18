package com.chickencc.dubbo.bootstrap;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.chickencc.dubbo.service.QuickConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@EnableDubboConfiguration
@SpringBootApplication(scanBasePackages = {"com.chickencc.dubbo"})
public class DubboSpringbootConsumerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DubboSpringbootConsumerApplication.class, args);
        QuickConsumer quickConsumer = context.getBean("quickConsumer", QuickConsumer.class);
        String s = quickConsumer.sayHello("张三");
        System.out.println(s);
    }
}
