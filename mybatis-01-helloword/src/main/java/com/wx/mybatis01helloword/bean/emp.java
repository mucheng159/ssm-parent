package com.wx.mybatis01helloword.bean;

import lombok.Data;

@Data
public class emp {

    private Integer id;
    private String name;
    private Integer age;
    private Integer deptId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpName() {
        return name;
    }

    public void setEmpName(String empName) {
        this.name = empName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }
}
