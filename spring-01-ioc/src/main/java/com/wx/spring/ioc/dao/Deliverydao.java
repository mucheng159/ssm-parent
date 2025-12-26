package com.wx.spring.ioc.dao;

import com.wx.spring.ioc.datasource.mydatasource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Deliverydao {
    @Autowired
    mydatasource mydatasource;


   public void save(){
        System.out.println("数据源+保存数据"+mydatasource);
    }
}
