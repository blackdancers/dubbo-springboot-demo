package com.chickencc.dubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component
public class QuickConsumer {

//    @Reference(url = "dubbo://127.0.0.1:20880", version = "1.0.1")
    @Reference(interfaceClass = DemoService.class, version = "1.0.1") //interfaceClass可省略
    private DemoService demoService;

    public String sayHello(String name) {
        return demoService.sayHello(name);
    }
}