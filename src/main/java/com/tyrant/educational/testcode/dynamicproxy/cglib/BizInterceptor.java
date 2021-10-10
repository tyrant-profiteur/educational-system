package com.tyrant.educational.testcode.dynamicproxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author:profiteur
 * @create 2021-10-10 19:25
 * @description
 **/
public class BizInterceptor implements MethodInterceptor {
    /**
     *
     * @param o 生成的子类对象
     * @param method 要代理目标类的方法
     * @param objects 参数
     * @param methodProxy 子类生成的代理方法
     * @return null
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("买书前");
        methodProxy.invokeSuper(o,objects);
        System.out.println("买书后");
        return null;
    }
}
