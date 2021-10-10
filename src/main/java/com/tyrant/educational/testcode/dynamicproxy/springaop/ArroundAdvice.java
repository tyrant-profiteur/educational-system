package com.tyrant.educational.testcode.dynamicproxy.springaop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author:profiteur
 * @create 2021-10-10 20:17
 * @description
 **/
public class ArroundAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("方法执行前");
        Object ret =methodInvocation.proceed();
        System.out.println("方法执行后");
        return ret;
    }
}
