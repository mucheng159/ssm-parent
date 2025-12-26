package com.wx.springmvc.parctice.Vo.req;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public class addvo {

    @NotBlank(message = "姓名不能为空")
    private String name;

    @NotNull
    @Max(value = 150 ,message = "年龄不能超过150")
    @Min(value = 0 ,message = "年龄不能小于0")
    private Integer age;

    @Email(message = "邮箱格式不正确")
    private String email;
    private String gender;
    private String address;
    private BigDecimal salary;

    public @NotBlank(message = "姓名不能为空") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "姓名不能为空") String name) {
        this.name = name;
    }

    public @NotNull @Max(value = 150, message = "年龄不能超过150") @Min(value = 0, message = "年龄不能小于0") Integer getAge() {
        return age;
    }

    public void setAge(@NotNull @Max(value = 150, message = "年龄不能超过150") @Min(value = 0, message = "年龄不能小于0") Integer age) {
        this.age = age;
    }

    public @Email(message = "邮箱格式不正确") String getEmail() {
        return email;
    }

    public void setEmail(@Email(message = "邮箱格式不正确") String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
