package com.wx.spring.tx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class Spring03TxApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring03TxApplication.class, args);
    }

}
