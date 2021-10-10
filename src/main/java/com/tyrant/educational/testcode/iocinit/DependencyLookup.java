package com.tyrant.educational.testcode.iocinit;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @author:profiteur
 * @create 2021-09-12 22:18
 * @description
 **/
public class DependencyLookup {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/META-INF/dependency-lookup.xml");
        lookupRealtime(beanFactory);
        lookupSingleByType(beanFactory);
        lookupCollectionByType(beanFactory);
    }

    /**
    创建DependencyLookup类，添加main方法，通过new ClassPathXmlApplicationContext，
    并且制定实例化bean的xml文件路径，classpath:/META-INF/dependency-lookup.xml。
    也就是刚才实例化user bean的xml文件路径。随后调用lookupRealTime方法，
    传入BeanFactory对象，利用BeanFactory中的getBean方法，找到xml文件中配置的bean id为user的实例
    */
    private static void lookupRealtime(BeanFactory beanFactory) {
        User user = (User)beanFactory.getBean("user");
        System.out.println(user);
    }

    /**
     * 根据类型查看单个bean
     * @param beanFactory
     */
    private static void lookupSingleByType(BeanFactory beanFactory){
        User user2 = beanFactory.getBean(VipUser.class);
        System.out.println("根据类型实时查询" + user2.toString());
    }

    /**
     * 查看多个bean
     * @param beanFactory
     */
    private static void lookupCollectionByType(BeanFactory beanFactory){
        if (beanFactory instanceof ListableBeanFactory){
            ListableBeanFactory listableBeanFactory = (ListableBeanFactory)beanFactory;
            Map<String,User> users = listableBeanFactory.getBeansOfType(User.class);
            System.out.println("查找多个 bean:" + users);
        }
    }
}
