package com.wx.mybatis01helloword.mapper;

import com.wx.mybatis01helloword.bean.customer;
import com.wx.mybatis01helloword.bean.order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ordermapper {

    order oderandcustomer(Long id);
}
