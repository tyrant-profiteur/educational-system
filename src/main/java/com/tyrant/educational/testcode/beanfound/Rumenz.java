package com.tyrant.educational.testcode.beanfound;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author:profiteur
 * @create 2021-09-15 22:11
 * @description
 **/
public class Rumenz implements InitializingBean {
    private Integer id;
    private String name;

    @Override
    public void afterPropertiesSet() throws Exception {
        //throw new Exception("初始化异常");
    }

    @Override
    public String toString() {
        return "Rumenz{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
