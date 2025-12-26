package com.wx.springmvc.parctice.controller;

import com.wx.springmvc.parctice.common.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hhh {
    @GetMapping("/hh")
    public R hh() {
        int i = 10 / 0;
        return R.ok();
    }
}
