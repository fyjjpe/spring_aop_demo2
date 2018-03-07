package com.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by yuanjie.fang on 2018/3/7.
 * 代理工厂
 */
public class ProxyFactory implements InvocationHandler {
    private Object stu;

    public Object createStudentProxy(Object stu) {
        this.stu = stu;
        return Proxy.newProxyInstance(stu.getClass().getClassLoader(),
                stu.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        StudentBean s = (StudentBean) stu;
        Object object = null;
        if (s.getName() != null) {
            object = method.invoke(stu, args);
        } else {
            System.out.println("名字为空，代理类已拦截");
        }
        return object;
    }
}
