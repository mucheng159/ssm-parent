package com.wx.spring.tx.user.impl;

import com.wx.spring.tx.bean.Book;
import com.wx.spring.tx.dao.account;
import com.wx.spring.tx.dao.bookdao;
import com.wx.spring.tx.user.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Component

public class userserviceimpl implements userservice {
    @Autowired
    bookdao bookdao;
    @Autowired
    account acc;


    @Transactional
    @Override
    public void zf(String username, Integer bookid, Integer stocknumber) {
        //获取图书信息
        Book book = bookdao.getbyid(bookid);

        //获取价格
        BigDecimal price = book.getPrice();
        BigDecimal total=new BigDecimal(stocknumber).multiply(price);

        //扣减用户余额
        acc.updateaccount(username,total);



        //扣减图书库存
        bookdao.updatebook(bookid,stocknumber);
    }
}
