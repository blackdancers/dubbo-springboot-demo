package com.chickencc.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = DemoService.class, version = "1.0.1")
public class DefaultDemoService implements DemoService {

    public String sayHello(String name) {
        return String.format("Hello, %s", name);
    }
}