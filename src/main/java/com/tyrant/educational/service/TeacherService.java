package com.tyrant.educational.service;

import com.tyrant.educational.dto.Teacher;

/**
 * @author:profiteur
 * @create 2021-10-17 22:57
 * @description 教师服务接口
 **/
public interface TeacherService {
    /**
     * 根据教师id获取教师详情
     *
     * @param id 教师id
     * @return 教师详情
     */
    Teacher findById(int id);
}
