package com.curtain.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Configuration    =   spring里的applicationContext.xml
 */
@Configuration
public class ConfigBean {
    /**
     * 配置负载均衡实现RestTemplate
     * IRule
     * AvailabilityFilteringRule:   会先过滤掉跳闸，访问故障的服务~，对剩下的服务进行轮询
     * RoundRobinRule:  轮询
     * RandomRule:  随机
     * RetryRule: 会先轮询，如果服务获取失败，会在一定时间内继续尝试
     * @return
     */
    @Bean
    @LoadBalanced //ribbon
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
