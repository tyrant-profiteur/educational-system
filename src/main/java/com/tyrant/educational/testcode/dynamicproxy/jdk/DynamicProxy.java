package com.tyrant.educational.testcode.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.SQLOutput;

/**
 * @author:profiteur
 * @create 2021-10-10 19:13
 * @description
 **/
public class DynamicProxy implements InvocationHandler {
    //代理真实的对象
    private Object service;
    //构造方法赋值

    public DynamicProxy(Object service) {
        this.service = service;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用真实方法之前
        System.out.println("买书前");
        //调用真实方法
        method.invoke(service,args);
        //调用真实方法之后
        System.out.println("买书后");
        return null;
    }
}
