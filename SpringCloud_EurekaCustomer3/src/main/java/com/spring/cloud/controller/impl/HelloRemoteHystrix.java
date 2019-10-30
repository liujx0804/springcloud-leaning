package com.spring.cloud.controller.impl;

import com.spring.cloud.controller.HelloRemote;
import org.springframework.stereotype.Component;

@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(String name) {
        return "消息" + name + "传递失败";
    }
}
