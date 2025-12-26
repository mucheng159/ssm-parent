package com.wx.spring.ioc.comfig;

import com.wx.spring.ioc.bean.Person;
import com.wx.spring.ioc.condition.maccondition;
import com.wx.spring.ioc.condition.windoscondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class personconfig {
    @Bean("zhangsan")
    public Person zhangsan(){
        Person person = new Person();
        person.setName("wx");
        person.setAge(21);
        person.setGender("男");
        return person;
    }
    @Bean("lisi")
    public Person lisi(){
        Person person = new Person();
        person.setName("lisi");
        person.setAge(21);
        person.setGender("男");
        return person;
    }
    @Conditional(maccondition.class)
    @Bean("jbs")
    public Person jbs(){
        Person person = new Person();
        person.setName("乔布斯");
        person.setAge(21);
        person.setGender("男");
        return person;
    }
    @Conditional(windoscondition.class)
    @Bean("bekc")
    public Person bekc(){
        Person person = new Person();
        person.setName("比尔盖茨");
        person.setAge(21);
        person.setGender("男");
        return person;
    }
}
