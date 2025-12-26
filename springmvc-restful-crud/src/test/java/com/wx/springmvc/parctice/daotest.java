package com.wx.springmvc.parctice;

import com.wx.springmvc.parctice.bean.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class daotest {
    @Autowired
    com.wx.springmvc.parctice.dao.employeedao employeedao;
    @Autowired
    com.wx.springmvc.parctice.service.employeeservice employeeservice;

    @Test
    void test02(){
        Employee employee = new Employee();

        employee.setId(5L);
        employee.setName("wsx66");
        employee.setAge(1891);
//        employee.setEmail("");
//        employee.setGender("");
//        employee.setAddress("sd");
        employee.setSalary(new BigDecimal("1000"));

        employeeservice.updateemp(employee);
    }

    @Test
    void test01(){
        Employee getid = employeedao.getid(4L);
        System.out.println(getid);

        Employee employee = new Employee();

        employee.setId(5L);
        employee.setName("wsx");
        employee.setAge(181);
        employee.setEmail("");
        employee.setGender("");
        employee.setAddress("sd");
        employee.setSalary(new BigDecimal("10"));

        employeedao.updateemp(employee);
    }
}
