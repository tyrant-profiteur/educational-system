package com.tyrant.educational.service.impl;

import com.tyrant.educational.dto.Teacher;
import com.tyrant.educational.enums.CourseTypeEnum;
import com.tyrant.educational.mapper.TeacherMapper;
import com.tyrant.educational.service.TeacherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author:profiteur
 * @create 2021-10-17 22:58
 * @description 教师服务实现类
 **/
@Service
public class TeacherServiceImpl implements TeacherService {
    private static final Logger logger = LoggerFactory.getLogger(TeacherServiceImpl.class);
    /**
     * 教师mapper
     */
    @Autowired
    private TeacherMapper teacherMapper;


    @Override
    public Teacher findById(int id) {
        Teacher teacher = teacherMapper.findById(id);
        teacher.setCourseName(CourseTypeEnum.getNameByCode(teacher.getCourse()));
        return teacher;
    }
}
