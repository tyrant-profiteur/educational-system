package com.tyrant.educational.testcode.dynamicproxy.cglib;

import org.springframework.cglib.proxy.Enhancer;

/**
 * @author:profiteur
 * @create 2021-10-10 19:27
 * @description
 **/
public class BizcglibClient {
    public static void main(String[] args){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Biz.class);
        enhancer.setCallback(new BizInterceptor());
        Biz biz = (Biz)enhancer.create();
        biz.help();
        biz.test();
     }
}
