package com.tyrant.educational.enums;

/**
 * @author:profiteur
 * @create 2021-10-17 23:34
 * @description 教师状态枚举类
 **/
public enum TeacherStatusEnum {
    /**
     * 空闲
     */
    FREE("1", "空闲"),
    ;

    private String code;
    private String name;

    TeacherStatusEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
