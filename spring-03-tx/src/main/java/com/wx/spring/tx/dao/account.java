package com.wx.spring.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class account {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void updateaccount(String username, BigDecimal balance) {
        String sql = "update account set balance = balance-? where username = ?";
        jdbcTemplate.update(sql,balance, username);

    }
}
