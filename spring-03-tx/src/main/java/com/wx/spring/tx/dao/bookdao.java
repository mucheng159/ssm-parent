package com.wx.spring.tx.dao;

import com.wx.spring.tx.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component

public class bookdao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public Book getbyid(Integer id) {
        String sql = "select * from book where id = ?";


        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Book.class), id);
        return book;
    }

    public void insertbook(Book book){
        String sql = "insert into book(bookname,price,stock) values(?,?,?)";

        jdbcTemplate.update(sql,book.getBookname(),book.getPrice(),book.getStock());
    }

    public void updatebook(Integer id,Integer stock){
        String sql = "update book set stock =stock- ? where id = ?";
        jdbcTemplate.update(sql,stock,id);
    }

    public void deletebook(Integer id){
        String sql = "delete from book where id = ?";
        jdbcTemplate.update(sql,id);
    }
}
