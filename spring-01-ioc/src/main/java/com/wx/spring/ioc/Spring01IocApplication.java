package com.wx.spring.ioc;

import com.wx.spring.ioc.bean.Dog;
import com.wx.spring.ioc.bean.Person;
import com.wx.spring.ioc.bean.car;
import com.wx.spring.ioc.conterll.usercontrell;
import com.wx.spring.ioc.dao.Deliverydao;
import com.wx.spring.ioc.dao.userdao;
import com.wx.spring.ioc.service.hhserice;
import lombok.ConfigurationKeys;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

@SpringBootApplication
public class Spring01IocApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(Spring01IocApplication.class, args);
        System.out.println("===============================================");

        Deliverydao dao = ioc.getBean(Deliverydao.class);
        dao.save();
    }
    public static void test08(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(Spring01IocApplication.class, args);
        System.out.println("===============================================");

        hhserice bean = ioc.getBean(hhserice.class);
        System.out.println("bean = " + bean);

        String gettype = bean.gettype();
        System.out.println("gettype = " + gettype);

        String name = bean.getName();
        System.out.println("name = " + name);


    }

    public static void test07(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(Spring01IocApplication.class, args);
        System.out.println("===============================================");
        usercontrell bean = ioc.getBean(usercontrell.class);

        System.out.println("userservice="+bean);

    }

    public static void test05(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(Spring01IocApplication.class, args);
        Map<String, Person> beans = ioc.getBeansOfType(Person.class);
        System.out.println("bean = " + beans);

        ConfigurableEnvironment environment = ioc.getEnvironment();
        String os = environment.getProperty("OS");
        System.out.println("os = " + os);
    }

    public static void test04(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(Spring01IocApplication.class, args);
        System.out.println("===========ioc====================");
        car bean = ioc.getBean(car.class);
        car bean1 = ioc.getBean(car.class);
        System.out.println(bean1 == bean1);

        Map<String, car> beansOfType = ioc.getBeansOfType(car.class);
        System.out.println("beansOfType: " + beansOfType);

    }

    public static void test03(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(Spring01IocApplication.class, args);
        System.out.println("===================================");
        usercontrell bean = ioc.getBean(usercontrell.class);
        System.out.println("bean = " + bean);

        userdao bean1 = ioc.getBean(userdao.class);
        System.out.println("bean1 = " + bean1);

        ConfigurationKeys bean2 = ioc.getBean(ConfigurationKeys.class);
        System.out.println("bean2 = " + bean2);
    }
    public static void test02(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(Spring01IocApplication.class, args);
        System.out.println("=================ioc================");
        Dog bean = ioc.getBean(Dog.class);
        System.out.println("bean = " + bean);

        Person zhangsan = (Person) ioc.getBean("zhangsan1",Person.class);
        System.out.println("zhangsan1==="+zhangsan);

    }

    public static void test01(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(Spring01IocApplication.class, args);
        System.out.println("ioc==="+ioc);

        System.out.println("===================================================");
//        String[] name = ioc.getBeanDefinitionNames();
//        for (String name1 : name) {
//            System.out.println("name====="+name1);
//
//        }


        Person zhangsan = (Person) ioc.getBean("zhangsan1",Person.class);
        System.out.println("zhangsan==="+zhangsan);

        Map<String, Person> type = ioc.getBeansOfType(Person.class);
        System.out.println("type==="+type);
    }



}
