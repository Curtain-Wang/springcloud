package com.curtain.springcloud.dao;

import com.curtain.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DaptDao {
    
    boolean addDept(Dept dept);
    
    Dept queryById(Long id);
    
    List<Dept> queryAll();
}
