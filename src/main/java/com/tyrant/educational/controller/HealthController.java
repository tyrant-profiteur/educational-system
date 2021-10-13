package com.tyrant.educational.controller;

import com.ruyuan.little.project.common.dto.CommonResponse;
import com.tyrant.educational.testcode.valueinterface.ValueTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;


/**
 * @author: profiteur
 * @create: 2021-09-10 20:18
 * @Description: 健康检查 controller
 **/
@RestController
public class HealthController {
    private static final Logger logger = LoggerFactory.getLogger(HealthController.class);

    @Autowired
    private ValueTest valueTest;

    @RequestMapping(value = "/")
    public CommonResponse health() throws Exception {
        throw new Exception("处理异常");
        //return CommonResponse.success();
    }

    @RequestMapping("/testValue")
    public String testValue() {
        return valueTest.getName() + "\n" + valueTest.getPassword() + "  "
                + Arrays.toString(valueTest.getToolArray()) + "\r"
                + Arrays.toString(valueTest.getToolList().toArray()) + "\r"
                + valueTest.getTool() + "\r"
                + valueTest.getHomePage() + "\r"
                + valueTest.getIp() + "\r"
                + valueTest.getPort() + "\r"
                + valueTest.getSystemPropertiesName() + "\r"
                + valueTest.getRandomNumber();
    }
}
