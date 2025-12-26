package com.wx.spring.ioc.comfig;

import com.wx.spring.ioc.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Dogconfig {
    @Bean
    public Dog dog(){
        return new Dog();
    }
}
