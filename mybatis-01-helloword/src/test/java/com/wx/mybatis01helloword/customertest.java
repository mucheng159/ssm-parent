package com.wx.mybatis01helloword;

import com.wx.mybatis01helloword.bean.customer;
import com.wx.mybatis01helloword.bean.emp;
import com.wx.mybatis01helloword.mapper.customermapper;
import com.wx.mybatis01helloword.mapper.empdtmapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class customertest {
    @Autowired
    customermapper customermapper;
    @Autowired
    empdtmapper empdtmapper;

    @Test
    void test01(){
//        customer getcustomeradnorder = customermapper.getcustomeradnorder(1L);
//        System.out.println(getcustomeradnorder);


        List<emp> tom = empdtmapper.findEmpByEmpno("tom", null);

        System.out.println(tom);
    }
}
