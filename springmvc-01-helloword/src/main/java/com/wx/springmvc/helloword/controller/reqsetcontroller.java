package com.wx.springmvc.helloword.controller;

import com.wx.springmvc.helloword.bean.Person;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;

@RestController
public class reqsetcontroller {


    @RequestMapping("/handle01")
    public String handle01(String username,String password,String cellphone,boolean agreement){
        System.out.println(username);
        System.out.println(password);
        System.out.println(cellphone);
        System.out.println(agreement);
        return "ok";
    }
    @RequestMapping("/handle02")
    public String handle02(
            @RequestParam("username") String name,
            @RequestParam(value = "password",required = false,defaultValue = "222") String pwd,
            @RequestParam("cellphone") String phone,
            @RequestParam(value = "agreement" ,required = false) boolean agr){
        System.out.println(name);
        System.out.println(pwd);
        System.out.println(phone);
        System.out.println(agr);
        return "ok";
    }
    @RequestMapping("/handle03")
    public String handle03(Person person){
        System.out.println(person);
        return "ok";
    }
    @RequestMapping("/handle04")
    public String handle04(@RequestHeader("host") String host){
        System.out.println(host);
        return "ok"+ host;
    }
    @RequestMapping("/handle06")
    public String handle06(Person person){
        System.out.println(person);
        return "ok==="+person;
    }
    @RequestMapping("/handle07")
    public String handle07(@RequestBody Person person){
        System.out.println(person);
        return "ok!!!!!!!!!";
    }
    @RequestMapping("/handle08")
    public String handle08(Person person,
                           @RequestParam("headerImg") MultipartFile headerImg,
                           @RequestParam("lifeImg") MultipartFile[] lifeImg
                           ) throws IOException {

        long size = headerImg.getSize();
        System.out.println(size);
        String originalFilename = headerImg.getOriginalFilename();
        System.out.println(originalFilename);
        headerImg.transferTo(new File("E:\\img\\"+originalFilename));

        System.out.println("========处理头像信息================");

        if (lifeImg.length>0) {
            for (MultipartFile multipartFile : lifeImg) {
                multipartFile.transferTo(new File("E:\\img\\"+multipartFile.getOriginalFilename()));
            }
        }
        System.out.println(person);
        return "ok!!!!!!!!!";
    }

    @RequestMapping("/handle09")
    public String handle09(HttpEntity<Person> entity){
        HttpHeaders headers = entity.getHeaders();
        System.out.println("所有请求头");
        System.out.println(headers);

        System.out.println("===================");
        Person body = entity.getBody();
        System.out.println("所有请求体");
        System.out.println(body);
        return "ok!!!!!!!!!";
    }
}
