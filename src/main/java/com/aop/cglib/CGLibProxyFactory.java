package com.aop.cglib;


import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by yuanjie.fang on 2018/3/8.
 */
public class CGLibProxyFactory implements MethodInterceptor {
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Object createStudent(Object object) {
        this.object = object;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(object.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        StudentBean stu = (StudentBean) object;
        Object result = null;
        if (stu.getName() != null) {
            result = methodProxy.invoke(object, objects);
        } else {
            System.out.println("该方法已经被拦截");
        }
        return result;
    }
}
