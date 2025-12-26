package com.wx.mybatis01helloword.bean;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class order {
    private Long id;
    private String address;
    private BigDecimal amount;
    private Long customerId;

    private  customer customer;

    public com.wx.mybatis01helloword.bean.customer getCustomer() {
        return customer;
    }

    public void setCustomer(com.wx.mybatis01helloword.bean.customer customer) {
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}
