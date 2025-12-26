package com.wx.springmvc.parctice.service.impl;

import com.wx.springmvc.parctice.BigException.bizexception;
import com.wx.springmvc.parctice.BigException.bizexceptionemp;
import com.wx.springmvc.parctice.service.employeeservice;
import com.wx.springmvc.parctice.bean.Employee;
import com.wx.springmvc.parctice.dao.employeedao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class employeeserviceimpl implements employeeservice {
    @Autowired
    employeedao employeedao;

    @Override
    public Employee getid(Long id) {
        return employeedao.getid(id);
    }

    @Override
    public void addemp(Employee employee) {
        employeedao.addemp(employee);
    }

    @Override
    public void updateemp(Employee employee) {
        Long id = employee.getId();
        if (id == null){
            throw new bizexception(bizexceptionemp.ORDER_CLOSE);
        }
        Employee getid = employeedao.getid(id);

        if (StringUtils.hasText(employee.getName())){
            getid.setName(employee.getName());
        }
        if (StringUtils.hasText(employee.getAddress())){
            getid.setAddress(employee.getAddress());
        }
        if (StringUtils.hasText(employee.getEmail())){
            getid.setEmail(employee.getEmail());
        }
        if (StringUtils.hasText(employee.getGender())){
            getid.setGender(employee.getGender());
        }
        if (employee.getAge() !=null){
            getid.setAge(employee.getAge());
        }
        if (employee.getSalary() !=null){
            getid.setSalary(employee.getSalary());
        }
        employeedao.updateemp(getid);

    }

    @Override
    public void deleteemp(Long id) {
    employeedao.deleteemp(id);
    }
}
