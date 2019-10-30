package com.spring.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    HelloRemote HelloRemote;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        System.out.println("222222222222222222");
        String hello = HelloRemote.hello(name);
        System.out.println("333333333333333333");
        return hello;
    }

}