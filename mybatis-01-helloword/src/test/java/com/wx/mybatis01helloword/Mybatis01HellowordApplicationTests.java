package com.wx.mybatis01helloword;

import com.wx.mybatis01helloword.bean.emp;
import com.wx.mybatis01helloword.mapper.empmapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mybatis01HellowordApplicationTests {
    @Autowired
    empmapper empmapper;

    @Test
    void test03(){
        List<emp> getall = empmapper.getall();
        for (emp emp : getall) {
            System.out.println(emp);
        }
    }

    @Test
    void test02(){
        emp emp = new emp();
        emp.setEmpName("2wx");
        emp.setAge(122);
        emp.setDeptId(1000);

//        empmapper.updateemp(emp);
//
//        empmapper.deleteemp(4);

        empmapper.addemp(emp);
        Integer id = emp.getId();
        System.out.println("id:"+id);
    }

    @Test
    void test01(){
        emp getid = empmapper.getid(1);
        System.out.println(getid);
    }

    @Test
    void contextLoads() {
    }

}
