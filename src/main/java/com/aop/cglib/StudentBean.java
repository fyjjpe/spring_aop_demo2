package com.aop.cglib;

/**
 * Created by yuanjie.fang on 2018/3/8.
 */
public class StudentBean {
    private String name;

    public StudentBean() {
    }

    public StudentBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Hello World");
    }
}
