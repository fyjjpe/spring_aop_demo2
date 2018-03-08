package com.aop.proxy;

/**
 * Created by yuanjie.fang on 2018/3/7.
 * Proxy Aop测试类
 */
public class Main {
    public static void main(String[] args) {
        StudentInterface s1 = new StudentBean();
        ProxyFactory factory = new ProxyFactory();
        StudentInterface s2 = (StudentInterface) factory.createStudentProxy(s1);
        s2.print();
    }
}
