package com.tyrant.educational.testcode.dynamicproxy.jdk;

/**
 * @author:profiteur
 * @create 2021-10-10 19:12
 * @description
 **/
public class ServiceImpl implements Service {
    @Override
    public void help() {
        System.out.println("买书");
    }
}
