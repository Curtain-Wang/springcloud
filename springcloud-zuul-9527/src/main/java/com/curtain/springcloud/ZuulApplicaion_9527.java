package com.curtain.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApplicaion_9527 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplicaion_9527.class);
    }
}
