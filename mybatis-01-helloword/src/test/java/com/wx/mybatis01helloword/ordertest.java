package com.wx.mybatis01helloword;

import com.wx.mybatis01helloword.bean.order;
import com.wx.mybatis01helloword.mapper.ordermapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ordertest {
    @Autowired
    ordermapper ordermapper;

    @Test
    void test01(){
        order oderandcustomer = ordermapper.oderandcustomer(1L);
        System.out.println(oderandcustomer);
    }

}
