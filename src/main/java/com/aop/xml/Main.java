package com.aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yuanjie.fang on 2018/3/8.
 * 测试spring配置xml文件形式实现Aop
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config-xml.xml");
        Student stu = (Student) ctx.getBean("stu");
        stu.print("whc");
        System.out.println("-------------------------");
        stu.print("test");

        /**
         * 结果：
             printBeforeAdvice()
             around执行喽！！！！
             whc执行了业务员方法方法
             finallyAdvice()!
             printAfterAdvice()!null
             -------------------------
             printBeforeAdvice()
             print()方法被拦截
             finallyAdvice()!
             printAfterAdvice()!null
         */

    }
}
