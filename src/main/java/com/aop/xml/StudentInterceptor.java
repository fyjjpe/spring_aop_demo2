package com.aop.xml;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by yuanjie.fang on 2018/3/8.
 * 学生切面类
 */

public class StudentInterceptor {
    /**
     * "execution(* com.aop.aspect.Student.print(..))"
     */
    public void printMethod() {

    }

    public void printBeforeAdvice() {
        System.out.println("printBeforeAdvice()");
    }

    public void printAfterAdvice(String flag) {
        System.out.println("printAfterAdvice()!" + flag);
    }

    public void finallyAdvice() {
        System.out.println("finallyAdvice()!");
    }

    public Object printAroundAdvice(ProceedingJoinPoint pjp, String name) throws Throwable {
        Object result = null;
        if (name.equals("whc")) {
            System.out.println("around执行喽！！！！");
            pjp.proceed();
        } else {
            System.out.println("print()方法被拦截");
        }
        return result;
    }
}
