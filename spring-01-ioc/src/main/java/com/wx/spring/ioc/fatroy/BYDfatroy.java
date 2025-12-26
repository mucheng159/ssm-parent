package com.wx.spring.ioc.fatroy;

import com.wx.spring.ioc.bean.car;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.cglib.proxy.Factory;
import org.springframework.stereotype.Component;

@Component
public class BYDfatroy implements FactoryBean<car> {
    @Override
    public car getObject() throws Exception {
        System.out.println("=============car============");
        car car=new car();
        return car;
    }

    @Override
    public Class<?> getObjectType() {
        return car.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
