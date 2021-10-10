package com.tyrant.educational.testcode.dynamicproxy.springaop;

import com.tyrant.educational.testcode.dynamicproxy.cglib.Biz;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author:profiteur
 * @create 2021-10-10 20:30
 * @description
 **/
public class AopTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new GenericXmlApplicationContext("classpath:aop/application.xml");
        Biz biz = applicationContext.getBean(Biz.class);
        biz.help();
        biz.test();
    }
}
