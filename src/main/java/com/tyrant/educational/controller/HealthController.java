package com.tyrant.educational.controller;

import com.ruyuan.little.project.common.dto.CommonResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: profiteur
 * @create: 2021-09-10 20:18
 * @Description: 健康检查 controller
 **/
@RestController
public class HealthController {

    @RequestMapping(value = "/")
    public CommonResponse health() {
        return CommonResponse.success();
    }
}
