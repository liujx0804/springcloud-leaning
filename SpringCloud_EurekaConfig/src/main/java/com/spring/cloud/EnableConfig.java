package com.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer     //激活对配置中心的支持
public class EnableConfig {

    public static void main(String[] args) {
        SpringApplication.run(EnableConfig.class, args);
    }

}
