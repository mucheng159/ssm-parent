package com.wx.springmvc.helloword.controller;

import com.wx.springmvc.helloword.bean.Person;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.net.URLEncoder;

@RestController
public class responscontroller {

    @RequestMapping("/resp01")
    public Person handle09(){
        Person person = new Person();
        person.setUsername("wx");
        person.setPassword("wx");
        person.setCellphone("11111");
        person.setAgreement(false);
        person.setGrade("三年级");
        person.setSex("男");
        person.setHobby(new String[]{"篮球","足球"});
        return person;
    }


    @RequestMapping("/download")
    public ResponseEntity<InputStreamResource> download() throws IOException {
        FileInputStream input = new FileInputStream("C:\\Users\\san\\Desktop\\image\\bizhi\\wallhaven-q6omvd.jpg");

        String encode = URLEncoder.encode("卧槽.jpg", "UTF-8");

        InputStreamResource resource = new InputStreamResource(input);

        return  ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .contentLength(input.available())
                .header("Content-Disposition","attachment;filename="+encode)
                .body(resource);

    }
}
