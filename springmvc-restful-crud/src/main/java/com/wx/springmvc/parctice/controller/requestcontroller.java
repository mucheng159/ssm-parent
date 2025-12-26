package com.wx.springmvc.parctice.controller;

import com.wx.springmvc.parctice.bean.Employee;
import com.wx.springmvc.parctice.common.R;
import com.wx.springmvc.parctice.service.employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class requestcontroller {
    @Autowired
    employeeservice empservice ;


    @GetMapping("/employee/{id}")
    public R get(@PathVariable("id") Long id){
        Employee getid = empservice.getid(id);
        return R.ok(getid);
    }
    @DeleteMapping("/employee/{id}")
    public R delet(@PathVariable("id") Long id){
        empservice.deleteemp(id);

        return R.ok();
    }

    @PostMapping("/employee")
    public R add(@RequestBody  Employee employee){
        empservice.addemp(employee);
        return R.ok();
    }
    @PutMapping("/employee")
    public R upda(@RequestBody  Employee employee){
        empservice.updateemp(employee);
        return R.ok();
    }


}
