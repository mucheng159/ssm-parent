package com.wx.spring.ioc.conterll;

import com.wx.spring.ioc.bean.Person;
import com.wx.spring.ioc.service.userservice;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;

@Data
@ToString
@Component
public class usercontrell {
    @Autowired
    userservice userservice;
    @Autowired
    Person lisi;

    @Autowired
    List<Person> people;
    @Autowired
    Map<String,Person> map;
    @Autowired
    ApplicationContext applicationContext;
}
