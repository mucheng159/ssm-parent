package com.wx.springmvc.helloword.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hellocontroller {

    @ResponseBody
    @RequestMapping(value = "/hello",method ={ RequestMethod.DELETE,RequestMethod.GET})
    public String hh() {
        return "hello,springmvc.你好!~~~~";
    }
}
