package com.curtain.springcloud;

import com.curtain.myrule.CurtainRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

//Ribbon 和 Eureka 整合以后，客户端可以直接调用，不用关心ip地址和端口号
@SpringBootApplication
@EnableEurekaClient
//在微服务启动的时候就能去加载我们自定义的ribbon类
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT", configuration = CurtainRule.class)
public class DeptConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_80.class, args);
    }
}
