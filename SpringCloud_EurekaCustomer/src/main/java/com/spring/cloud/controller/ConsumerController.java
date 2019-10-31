package com.spring.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    HelloRemote HelloRemote;
 ////   @Value("${document}")
    private String msg;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        String hello = HelloRemote.hello(name);
        return hello;
    }

    @RequestMapping("/hello")
    public String getMsg() {
        return this.msg;
    }

}