package com.curtain.springcloud.controller;

import com.curtain.springcloud.pojo.Dept;
import com.curtain.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//提供restful服务
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "hystrixQueryById")
    public Dept queryById(@PathVariable("id") Long id){
        Dept dept = deptService.queryById(id);
        if (dept == null){
            throw new RuntimeException("id=>" + id + ",不存在该用户，或者信息无法找到");
        }
        return dept;
    }

    //备选方案
    public Dept hystrixQueryById(@PathVariable("id") Long id){
        return new Dept()
                .setDeptno(id)
                .setDname("id=>" + id + "没有对那个的信息，null--@Hystrix")
                .setDbSource("no this database in MySQL");
    }

}
