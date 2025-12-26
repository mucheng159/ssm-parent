package com.wx.springmvc.parctice.dao;

import com.wx.springmvc.parctice.bean.Employee;

public interface employeedao {
    Employee getid(Long id);

    void  addemp(Employee employee);

    void updateemp(Employee employee);

    void deleteemp(Long id);
}
