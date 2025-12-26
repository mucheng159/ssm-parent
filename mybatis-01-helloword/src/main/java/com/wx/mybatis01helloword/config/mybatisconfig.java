package com.wx.mybatis01helloword.config;

import com.github.pagehelper.PageInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class mybatisconfig {
    @Bean
    PageInterceptor pageInterceptor (){
        PageInterceptor pageInterceptor = new PageInterceptor();


        return pageInterceptor;
    }
}
