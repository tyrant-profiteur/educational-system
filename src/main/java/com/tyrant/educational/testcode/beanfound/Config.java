package com.tyrant.educational.testcode.beanfound;

import org.springframework.context.annotation.Bean;

/**
 * @author:profiteur
 * @create 2021-09-15 22:17
 * @description
 **/
public class Config {
    @Bean
    public Rumenz rumenz1(){
        Rumenz r = new Rumenz();
        r.setId(1);
        r.setName("张三");
        return r;
    }

    @Bean
    public Rumenz rumenz(){
        Rumenz r = new Rumenz();
        r.setId(2);
        r.setName("李四");
        return r;
    }
}
