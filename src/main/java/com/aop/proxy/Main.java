package com.aop.proxy;

/**
 * Created by yuanjie.fang on 2018/3/7.
 * Proxy Aop测试类
 */
public class Main {
    public static void main(String[] args) {
        StudentBean s1 = new StudentBean("zhangsan");
        ProxyFactory factory = new ProxyFactory();
        StudentBean s2 = (StudentBean) factory.createStudentProxy(s1);
        s2.print();
    }
}
