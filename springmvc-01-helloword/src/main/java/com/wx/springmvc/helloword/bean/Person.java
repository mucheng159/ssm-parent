package com.wx.springmvc.helloword.bean;

import lombok.Data;
import lombok.ToString;

import java.util.Arrays;

@Data
public class Person {

    private String username;
    private String password;
    private String cellphone;
    private boolean agreement;
    private Address address;
    private String sex;
    private String[] hobby;
    private String grade;

}

@Data
class Address {
    private String province;
    private String city;
    private String area;
}
