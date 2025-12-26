package com.wx.spring.ioc.service;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Getter
@ToString
@Component
public class hhserice implements EnvironmentAware , BeanNameAware {
    private Environment environment;
    private String name;


    @Override
    public void setEnvironment(Environment environment) {
    this.environment = environment;
    }

    public String gettype(){
        return environment.getProperty("OS");
    }

    @Override
    public void setBeanName(String name) {
        this.name = name;
    }
}
