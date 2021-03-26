package com.curtain.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//启动类
@SpringBootApplication
@EnableEurekaClient //在服务启动后，自动注册到eureka中!
@EnableDiscoveryClient //服务发现
public class DepeProvider_8001 {
    public static void main(String[] args) {
        SpringApplication.run(DepeProvider_8001.class, args);
    }
}
