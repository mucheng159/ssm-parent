package com.wx.mybatis01helloword.mapper;

import com.wx.mybatis01helloword.bean.customer;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface customermapper {

    customer getcustomeradnorder(Long id);
}
