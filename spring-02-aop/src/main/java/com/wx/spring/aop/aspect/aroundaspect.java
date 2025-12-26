package com.wx.spring.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class aroundaspect {
    @Pointcut("execution(int *(int,int ))")
    public void pointcut(){}

    @Around("pointcut()")
    public Object aroundaspect(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        System.out.println("环绕-前置通知");
        Object proceed=null;
        try {
            proceed = pjp.proceed(args);
            System.out.println("环绕-返回通知"+proceed);
        }catch (Exception e){
            System.out.println("环绕-异常通知"+e.getMessage());
        }finally {
            System.out.println("环绕-后置通知");
        }



        return proceed;
    }
}
