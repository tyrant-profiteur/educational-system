package com.tyrant.educational.mapper;

import com.tyrant.educational.dto.Teacher;
import org.apache.ibatis.annotations.Select;

/**
 * @author:profiteur
 * @create 2021-10-17 22:54
 * @description 教师 Mapper 组件
 **/
public interface TeacherMapper {
    /**
     * 根据教师id获取教师详情
     *
     * @param id 教师id
     * @return 教师详情
     */
    @Select("select * from t_teacher where id = #{id}")
    Teacher findById(int id);
}
