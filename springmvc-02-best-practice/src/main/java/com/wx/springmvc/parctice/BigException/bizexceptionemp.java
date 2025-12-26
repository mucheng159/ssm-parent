package com.wx.springmvc.parctice.BigException;

import lombok.Data;
import lombok.Getter;


public enum bizexceptionemp {

    ORDER_CLOSE(1001, "订单已关闭"),
    ORDER_NOT_EXIT(1002, "订单不存在"),
    ORDER_TIMEOUT(1001, "订单超时"),


    SHOP_STOCK__NOT_ENGHT(2001, "商品库存不足"),
    SHOP_HAS_SOLDA(2002, "商品已售罄"),
    // 可以继续添加其他枚举值
    ;



    @Getter
    private Integer code;
    @Getter
    private String msg;

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private bizexceptionemp(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
