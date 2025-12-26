package com.wx.mybatis01helloword.bean;

import lombok.Data;

import java.util.List;

@Data
public class customer {
    private  Long id;
    private  String customerName;
    private  String phone;
    private   List<order> orders;

    public List<com.wx.mybatis01helloword.bean.order> getOrder() {
        return orders;
    }

    public void setOrder(List<com.wx.mybatis01helloword.bean.order> order) {
        this.orders = orders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
