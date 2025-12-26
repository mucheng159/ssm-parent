package com.wx.spring.aop.aspect;

import lombok.ToString;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
@ToString
public class logaspect {

    @Pointcut("execution(int *(int,int ))")
    public void pointcut(){}

    @Before("pointcut()")
    public void logstart(JoinPoint joinpoint){
        MethodSignature signature = (MethodSignature) joinpoint.getSignature();
        String name = signature.getName();
        Object[] args = joinpoint.getArgs();
        System.out.println("[切面-日志]["+name+"]开始前置..........参数["+ Arrays.toString(args) +"]"    );
    }
    @After("pointcut()")
    public void logsend(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String name = signature.getName();
        System.out.println("[切面-日志]["+name+"]结束后置.........."    );
    }
    @AfterReturning(value = "pointcut()",
            returning = "result")
    public void logrunt(JoinPoint joinPoint,Object result){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String name = signature.getName();
        System.out.println("[切面-日志]["+name+"]返回.....值["+result+"]"    );
    }
    @AfterThrowing(value = "pointcut()",throwing = "e")
    public void logerror(JoinPoint joinPoint,Exception e){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String name = signature.getName();
        System.out.println("[切面-日志]["+name+"]异常.........["+e.getMessage()+"]."    );
    }
}
