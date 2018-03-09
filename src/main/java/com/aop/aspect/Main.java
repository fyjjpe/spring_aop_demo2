package com.aop.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yuanjie.fang on 2018/3/8.
 * 测试spring注解方式实现Aop
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config-aspect.xml");
        Student stu = (Student) ctx.getBean("stu");
        stu.print("whc");
        System.out.println("-------------------------");
        stu.print("test");
        /**
         * 结果：
             around执行喽！！！！
             before!
             whc执行了业务员方法方法
             after!
             afterReturning!null
             -------------------------
             around执行喽！！！！
             print()方法被拦截
             after!
             afterReturning!null
         */
    }
}
