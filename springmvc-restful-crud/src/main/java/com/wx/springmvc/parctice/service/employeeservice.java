package com.wx.springmvc.parctice.service;

import com.wx.springmvc.parctice.bean.Employee;

public interface employeeservice {
    Employee getid(Long id);

    void  addemp(Employee employee);

    void updateemp(Employee employee);

    void deleteemp(Long id);
}
