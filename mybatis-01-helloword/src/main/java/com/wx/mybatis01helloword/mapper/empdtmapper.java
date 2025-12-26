package com.wx.mybatis01helloword.mapper;

import com.wx.mybatis01helloword.bean.emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

@Mapper
public interface empdtmapper {

   List<emp>  findEmpByEmpno(@Param("name") String name, @Param("deptId") BigDecimal deptId);
   List<emp> all();
}
