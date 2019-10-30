package com.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableDiscoveryClient      //启用服务注册与发现
@EnableFeignClients         //启用feign进行远程调用
@EnableHystrixDashboard
@EnableCircuitBreaker
@EnableHystrix
public class EurekaCustomer3 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaCustomer3.class, args);
    }

}
