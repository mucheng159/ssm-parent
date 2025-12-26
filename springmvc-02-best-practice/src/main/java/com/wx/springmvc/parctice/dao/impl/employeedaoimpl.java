package com.wx.springmvc.parctice.dao.impl;

import com.wx.springmvc.parctice.dao.employeedao;
import com.wx.springmvc.parctice.bean.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class employeedaoimpl implements employeedao {
    
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    @Override
    public Employee getid(Long id) {
        String sql = "select * from employee where id = ?";
        Employee employee = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Employee.class), id);
        return employee;
    }

    @Override
    public void addemp(Employee employee) {
        String sql = "insert into employee(name,age,email,gender,address,salary) values(?,?,?,?,?,?)";
        jdbcTemplate.update(sql,employee.getName(),employee.getAge(),employee.getEmail(),employee.getGender(),employee.getAddress(),employee.getSalary());
    }

    @Override
    public void updateemp(Employee employee) {
        String sql="update employee set name=?,age=?,email=?,gender=?,address=?,salary=? where id=?";
        jdbcTemplate.update(sql,employee.getName(),employee.getAge(),employee.getEmail(),employee.getGender(),employee.getAddress(),employee.getSalary(),employee.getId());

    }

    @Override
    public void deleteemp(Long id) {
        String sql = "delete from employee where id = ?";
        jdbcTemplate.update(sql,id);

    }
}
