package com.wx.springmvc.parctice.advice;

import com.wx.springmvc.parctice.BigException.bizexception;
import com.wx.springmvc.parctice.common.R;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ResponseBody
@ControllerAdvice
public class qqexadvice {


    @ExceptionHandler(bizexception.class)
    public R bizexception(bizexception e) {
        Integer code = e.getCode();
        String message = e.getMsg();

        return R.error(code, message);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public R methodArgumentNotValidException(MethodArgumentNotValidException ex) {
        BindingResult result = ex.getBindingResult();
        List<FieldError> eror = result.getFieldErrors();
        Map<String, String> map = new HashMap<>();
        for (FieldError error : eror) {
            String field = error.getField();
            String message = error.getDefaultMessage();
            map.put(field, message);
        }

        return R.error(500,"校验错误",map);
    }

    @ExceptionHandler(Throwable.class)
    public R exitio(Throwable e) {
        System.out.println("quanju" + e.getClass());
        return R.error(400, e.getMessage());
    }

    @ExceptionHandler(ArithmeticException.class)
    public R exitio(ArithmeticException e) {
        System.out.println("数学");
        return R.error(400, e.getMessage());
    }


}
