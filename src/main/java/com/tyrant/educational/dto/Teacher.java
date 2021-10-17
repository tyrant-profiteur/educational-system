package com.tyrant.educational.dto;

import java.math.BigDecimal;

/**
 * @author:profiteur
 * @create 2021-10-17 23:33
 * @description 教师表
 **/
public class Teacher {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 教书名称
     */
    private String teacherName;

    /**
     * 学科
     */
    private String course;

    /**
     * 学科名称
     */
    private String courseName;

    /**
     * 评分
     */
    private BigDecimal score;

    /**
     * 教学天数
     */
    private Integer teachingDays;

    /**
     * 状态 {@link com.tyrant.educational.enums.TeacherStatusEnum}
     */
    private String status;

    /**
     * 授课总数
     */
    private Integer teachingCount;

    /**
     * 每天教学价格
     */
    private BigDecimal priceOfDay;

    /**
     * 开始教学时间
     */
    private String startTime;

    /**
     * 简介
     */
    private String description;

    /**
     * 照片
     */
    private String photo;

    /**
     * 详细信息
     */
    private String detail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public Integer getTeachingDays() {
        return teachingDays;
    }

    public void setTeachingDays(Integer teachingDays) {
        this.teachingDays = teachingDays;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTeachingCount() {
        return teachingCount;
    }

    public void setTeachingCount(Integer teachingCount) {
        this.teachingCount = teachingCount;
    }

    public BigDecimal getPriceOfDay() {
        return priceOfDay;
    }

    public void setPriceOfDay(BigDecimal priceOfDay) {
        this.priceOfDay = priceOfDay;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", teacherName='" + teacherName + '\'' +
                ", course='" + course + '\'' +
                ", courseName='" + courseName + '\'' +
                ", score=" + score +
                ", teachingDays=" + teachingDays +
                ", status='" + status + '\'' +
                ", teachingCount=" + teachingCount +
                ", priceOfDay=" + priceOfDay +
                ", startTime='" + startTime + '\'' +
                ", description='" + description + '\'' +
                ", photo='" + photo + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}
