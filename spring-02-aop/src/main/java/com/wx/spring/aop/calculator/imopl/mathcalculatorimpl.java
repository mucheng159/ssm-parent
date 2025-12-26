package com.wx.spring.aop.calculator.imopl;

import com.wx.spring.aop.calculator.mathcalculator;
import org.springframework.stereotype.Component;

@Component
public class mathcalculatorimpl implements mathcalculator {
    @Override
    public int add(int i, int j) {
        int result = i + j;
        System.out.println("结果:"+result);
        return result;
    }

    @Override
    public int jf(int i, int j) {
        int result = i - j;
        System.out.println("结果:"+result);
        return result;
    }

    @Override
    public int chuf(int i, int j) {
        int result = i / j;
        System.out.println("结果:"+result);
        return result;
    }

    @Override
    public int cf(int i, int j) {
        int result = i * j;
        System.out.println("结果:"+result);
        return result;
    }
}
