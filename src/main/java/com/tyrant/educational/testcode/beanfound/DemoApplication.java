package com.tyrant.educational.testcode.beanfound;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author:profiteur
 * @create 2021-09-15 22:13
 * @description
 **/
public class DemoApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(DemoApplication.class);//不注册 Rumenz
        ac.refresh();
        //NoSuchBeanDefinitionException 不存在要找的bean
        byBeanFactory(ac);
        ac.close();
    }

    private static void byBeanFactory(AnnotationConfigApplicationContext ac) {
        ac.getBean(Rumenz.class);
    }
}
