package com.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by yuanjie.fang on 2018/3/8.
 * 学生切面类
 */
@Aspect
public class StudentInterceptor {
    /**
     * "execution(* com.aop.aspect.Student.print(..))"
     */
    @Pointcut("execution(* com.aop.aspect.Student.print(..))")
    public void printMethod() {

    }

    @Before("printMethod()")
    public void printBeforeAdvice() {
        System.out.println("before!");
    }

    @AfterReturning(pointcut = "printMethod()", returning = "flag")
    public void printAfterAdvice(String flag) {
        System.out.println("afterReturning!" + flag);
    }

    @After("printMethod()")
    public void finallyAdvice() {
        System.out.println("after!");
    }

    @Around("printMethod() && args(name)")
    public Object printAroundAdvice(ProceedingJoinPoint pjp, String name) throws Throwable {
        System.out.println("around执行喽！！！！");
        Object result = null;
        if (name.equals("whc")) {
            pjp.proceed();
        } else {
            System.out.println("print()方法被拦截");
        }
        return result;
    }
}
