package com.curtain.springcloud.controller;

import com.curtain.springcloud.pojo.Dept;
import com.curtain.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {
    /**
     * 理解：消费者，不应该有service层
     * RestTemplate里面的方法供我们直接调用，注册到Spring中
     * RestTemplate提供多种便捷访问远程http服务的方法，简单的restful服务模板
     *(String url, Class<T> responseType, Map<String, ?> uriVariables)
     */
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DeptClientService deptClientService = null;

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return this.deptClientService.queryById(id);
    }

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return this.deptClientService.addDept(dept);
    }

    @RequestMapping("/comsumer/dept/list")
    public List<Dept> queryAll(){
        return this.deptClientService.queryByAll();
    }
}
