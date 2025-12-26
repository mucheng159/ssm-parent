package com.wx.spring.tx;

import com.wx.spring.tx.dao.account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class accounttest {


    @Autowired
    account acc;

    @Test
    void test01(){
        acc.updateaccount("lisi",new BigDecimal("100"));
    }
}
