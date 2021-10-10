package com.tyrant.educational.testcode.dynamicproxy.springaop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author:profiteur
 * @create 2021-10-10 20:16
 * @description
 **/
public class BeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("方法执行之前增强");
    }
}
