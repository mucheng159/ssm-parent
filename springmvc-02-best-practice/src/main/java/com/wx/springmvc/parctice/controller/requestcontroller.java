package com.wx.springmvc.parctice.controller;

import com.wx.springmvc.parctice.Vo.req.addvo;
import com.wx.springmvc.parctice.Vo.req.updatevo;
import com.wx.springmvc.parctice.service.employeeservice;
import com.wx.springmvc.parctice.bean.Employee;
import com.wx.springmvc.parctice.common.R;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

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
    public R add(@RequestBody @Valid addvo addvo){
        Employee employee = new Employee();
        BeanUtils.copyProperties(addvo,employee);
        empservice.addemp(employee);

        return R.ok();
    }
    @PutMapping("/employee")
    public R upda(@RequestBody updatevo vo){
        Employee employee = new Employee();
        BeanUtils.copyProperties(vo,employee);
        empservice.updateemp(employee);
        return R.ok();
    }


}
