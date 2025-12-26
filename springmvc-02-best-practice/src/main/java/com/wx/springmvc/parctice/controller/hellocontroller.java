package com.wx.springmvc.parctice.controller;

import com.wx.springmvc.parctice.common.R;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {

    @GetMapping("/hello")
    public R hh(@RequestParam(value = "i",defaultValue = "0") Integer j){
       int i=10/j;
        return R.ok();
    }
    @ExceptionHandler(ArithmeticException.class)
    public R err(ArithmeticException e){
        return R.error(200,"执行异常"+e.getMessage());
    }
}
