package com.wx.springmvc.parctice.common;

import lombok.Data;

@Data
public class R<T> {
    private Integer code;
    private String msg;
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static<T> R<T> ok(T data){
        R<T> r=new R<T>();
        r.setCode(200);
        r.setMsg("ok");
        r.setData(data);
        return r;
    }

    public static R ok(){
        R r=new R<>();
        r.setCode(200);
        r.setMsg("ok");
        return r;

    }
}
