package com.wx.mybatis01helloword.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageInterceptor;
import com.wx.mybatis01helloword.bean.emp;
import com.wx.mybatis01helloword.mapper.empdtmapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class pagecontroller {

    @Autowired
    empdtmapper empdtmapper;

    @GetMapping("/page")
    public PageInfo getpage(@RequestParam("pagenum") Integer pagenum){
        PageHelper.startPage(pagenum,5);

        List<emp> list=empdtmapper.all();

        return new PageInfo<>(list);

    }
}
