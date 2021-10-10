package com.tyrant.educational.testcode.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author:profiteur
 * @create 2021-10-10 19:16
 * @description
 **/
public class Client {
    public static void main(String[] args) {
        //要代理的真实对象
        Service service = new ServiceImpl();
        //代理哪个对象，就传入哪个对象，最后通过真实对象来调用其方法
        InvocationHandler handler = new DynamicProxy(service);
        Service serviceProxy = (Service) Proxy.newProxyInstance(service.getClass().getClassLoader(),
                service.getClass().getInterfaces(), handler);
        serviceProxy.help();
    }
}
