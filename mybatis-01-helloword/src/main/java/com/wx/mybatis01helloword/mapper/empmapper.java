package com.wx.mybatis01helloword.mapper;

import com.wx.mybatis01helloword.bean.emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface empmapper {

    emp getid(Integer id);

    List<emp> getall();

    void  addemp(emp emp);


    void updateemp(emp emp);

    void deleteemp(Integer id);
}
