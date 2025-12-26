package com.wx.spring.ioc.comfig;

import com.wx.spring.ioc.datasource.mydatasource;
import lombok.Builder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Configuration
public class datasourceconfig {

    @Profile({"dev","default"})
    @Bean
    public mydatasource dev(){
        mydatasource mydatasource=new mydatasource();
        mydatasource.setUrl("jdbc:mysql://localhost:3306/dev");
        mydatasource.setUsername("dev_root");
        mydatasource.setPassward("dev_root");
        return mydatasource;
    }

    @Profile("test")
    @Bean
    public mydatasource test(){
        mydatasource mydatasource=new mydatasource();
        mydatasource.setUrl("jdbc:mysql://localhost:3306/test");
        mydatasource.setUsername("test_root");
        mydatasource.setPassward("test_root");
        return mydatasource;
    }

    @Profile("prod")
    @Bean
    public mydatasource prod(){
        mydatasource mydatasource=new mydatasource();
        mydatasource.setUrl("jdbc:mysql://localhost:3306/prod");
        mydatasource.setUsername("prod_root");
        mydatasource.setPassward("prod_root");
        return mydatasource;
    }


}
