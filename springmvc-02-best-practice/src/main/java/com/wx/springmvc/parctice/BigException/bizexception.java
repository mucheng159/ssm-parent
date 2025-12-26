package com.wx.springmvc.parctice.BigException;

import lombok.Data;

@Data
public class bizexception extends RuntimeException {
    private Integer code;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public bizexception(Integer code, String msg){
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public bizexception(bizexceptionemp e) {
        super(e.getMsg());
        this.code = e.getCode();
        this.msg = e.getMsg();
    }

//    public bizexception(bizexceptionemp e) {
//        super(e.getMsg());
//        this.code = e.getCode();
//        this.msg = e.getMsg();
//
//    }

}
