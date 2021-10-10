package com.tyrant.educational.testcode.beanfound;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author:profiteur
 * @create 2021-09-15 22:13
 * @description
 **/
public class DemoApplication1 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(Config.class);//注册 Rumenz
        ac.refresh();
        //NoUniqueBeanDefinitionException 要找的bean不唯一
        byBeanFactory(ac);
        ac.close();
    }

    private static void byBeanFactory(AnnotationConfigApplicationContext ac) {
        ac.getBean(Rumenz.class);
    }
}
