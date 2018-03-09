package com.aop.aspect;

/**
 * Created by yuanjie.fang on 2018/3/8.
 */
public class Student {
    public String print(String name){
        System.out.println(name+"执行了业务员方法方法");
        return "Hello World!";
    }
}
