package com.aop.cglib;

/**
 * Created by yuanjie.fang on 2018/3/8.
 */
public class Main {
    public static void main(String[] args) {
        StudentBean s1 =
                (StudentBean) (new CGLibProxyFactory().createStudent(new StudentBean()));

        StudentBean s2 =
                (StudentBean) (new CGLibProxyFactory().createStudent(new StudentBean("zhangsan")));

        s1.print();
        System.out.println();
        s2.print();
    }
}
