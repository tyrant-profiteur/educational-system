package com.tyrant.educational.testcode.valueinterface;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.net.URL;
import java.util.List;

/**
 * @author:profiteur
 * @create 2021-10-08 21:35
 * @description
 **/
@PropertySource("classpath:my.properties")
@Component
public class ValueTest {
    /**
     * 获取 application.properties 配置的属性
     */
    @Value("${user.name}")
    private String name;

    /**
     * 获取 my.properties 配置的属性
     */
    @Value("${user.password}")
    private String password;

    /**
     * 注入数组，自动根据 "," 分割
     */
    @Value("${tools}")
    private String[] toolArray;

    /**
     * 注入列表，自动根据 "," 分割
     */
    @Value("${tools}")
    private List<String> toolList;

    /**
     * 注入普通字符串
     */
    @Value("测试")
    private String wechatSubscription;

    /**
     * 注入操作系统属性
     */
    @Value("#{systemProperties['os.name']}")
    private String systemPropertiesName;

    /**
     * 注入表达式结果
     */
    @Value("#{T(java.lang.Math).random() * 100.0}")
    private double randomNumber;

    /**
     * 注入其他Bean属性
     */
    @Value("#{config.tool}")
    private String tool;

    /**
     * 注入列表形式,自动根据"|"分割
     */
    @Value("#{'${words}'.split('\\|')}")
    private List<String> numList;

    /**
     * 注入文件资源
     */
     //@Value("classpath:config.xml")
     private Resource resourceFile;

     /**
     * 注入URL资源
     */
    @Value("http://www.choupangxia.com")
    private URL homePage;

    /**
     * 如果属性中未配置IP，则使用默认值
     */
    @Value("${ip:127.0.0.1}")
    private String ip;

    /**
     * 如果系统属性中未获取到port的值，则使用8888
     */
    @Value("#{systemProperties['port']?:'8888'}")
    private String port;

    /* ${}中直接使用“:”对未定义或为空的值进行默认值设置，而#{}则需要使用“?:”对未设置的属性进行默认值设置 */

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String[] getToolArray() {
        return toolArray;
    }

    public List<String> getToolList() {
        return toolList;
    }

    public String getWechatSubscription() {
        return wechatSubscription;
    }

    public String getSystemPropertiesName() {
        return systemPropertiesName;
    }

    public double getRandomNumber() {
        return randomNumber;
    }

    public String getTool() {
        return tool;
    }

    public List<String> getNumList() {
        return numList;
    }

    public Resource getResourceFile() {
        return resourceFile;
    }

    public URL getHomePage() {
        return homePage;
    }

    public String getIp() {
        return ip;
    }

    public String getPort() {
        return port;
    }
}
