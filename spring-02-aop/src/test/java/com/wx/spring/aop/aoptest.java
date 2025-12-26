package com.wx.spring.aop;

import com.wx.spring.aop.calculator.mathcalculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class aoptest {
    @Autowired
    mathcalculator mathcalculator;


    @Test
    void test01(){
        System.out.println(mathcalculator);
        mathcalculator.add(10, 20);



    }
}
