package com.tyrant.educational.controller;

import com.ruyuan.little.project.common.dto.CommonResponse;
import com.tyrant.educational.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:profiteur
 * @create 2021-10-17 22:55
 * @description 教师 Controller 组件
 **/
@RestController
@RequestMapping("/teacher")
public class TeacherController {
    /**
     * 教师service
     */
    @Autowired
    private TeacherService teacherService;

    /**
     * 根据教师id查询教师信息
     *
     * @param id 教师id
     * @return 教师信息
     */
    @GetMapping("/{id}")
    public CommonResponse findById(@PathVariable String id) {
        return CommonResponse.success(teacherService.findById(Integer.parseInt(id)));
    }
}
