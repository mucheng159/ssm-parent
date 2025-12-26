package com.wx.spring.ioc.comfig;

import lombok.ConfigurationKeys;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@ComponentScan(basePackages = "com.wx")
@Configuration
public class APPconfig {
}
