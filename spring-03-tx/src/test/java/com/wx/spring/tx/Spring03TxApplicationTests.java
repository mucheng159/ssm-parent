package com.wx.spring.tx;

import com.wx.spring.tx.bean.Book;
import com.wx.spring.tx.dao.bookdao;
import com.wx.spring.tx.user.userservice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class Spring03TxApplicationTests {
    @Autowired
    DataSource dataSource;
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    bookdao bookdao;
    @Autowired
    userservice userservice;

    @Test
    void  test05(){
        userservice.zf("zhangsan",1,2);
    }


    @Test
    void  test04(){
        bookdao.deletebook(4);
    }

    @Test
    void  test03(){
        bookdao.updatebook(3,20);
    }

    @Test
    void  test02(){
        Book book=new Book();
        book.setBookname("wx");
        book.setPrice(new BigDecimal("19.2"));
        book.setStock(100);
        bookdao.insertbook(book);
    }

    @Test
    void  test01(){
        Book getbyid = bookdao.getbyid(1);
        System.out.println(getbyid);
    }

    @Test
    void contextLoads() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }

}
