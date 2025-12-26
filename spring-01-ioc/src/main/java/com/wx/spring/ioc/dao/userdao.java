package com.wx.spring.ioc.dao;

import com.wx.spring.ioc.bean.Dog;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Component
public class userdao {

    Dog dog;

    public  void  setDog(){
        System.out.println("setdog");
         this.dog=dog;
     }
}
