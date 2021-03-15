package com.curtain.springcloud.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author ：Curtain
 * @date ：Created in 2021/3/15 15:45
 * @description：Dept实体类，orm ， 类表关系映射
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)//链式写法
public class Dept implements Serializable {
    
    private Long deptno;//主键
    private String dname;
    //这个数据存在哪个数据库的,微服务，一个服务对应一个数据库,同一个信息可能存在不同的数据库
    private String dbSource;

    public Dept(String dname) {
        this.dname = dname;
    }

    /**
     * 链式写法
     * Dept dept = new Dept();
     * dept.setDeptNo(1).setDname("123").setDbSource("DB001)
     */
}
