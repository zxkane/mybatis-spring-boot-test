package com.cn.zbb.model;

import java.io.Serializable;

public class DmTeacherClass implements Serializable {
    private Integer dmtcId;

    private Integer dmtcTeacherId;

    private String dmtcCourseName;

    private Integer dmtcSchoolId;

    private Integer dmtcClassId;

    public Integer getDmtcId() {
        return dmtcId;
    }

    public void setDmtcId(Integer dmtcId) {
        this.dmtcId = dmtcId;
    }

    public Integer getDmtcTeacherId() {
        return dmtcTeacherId;
    }

    public void setDmtcTeacherId(Integer dmtcTeacherId) {
        this.dmtcTeacherId = dmtcTeacherId;
    }

    public String getDmtcCourseName() {
        return dmtcCourseName;
    }

    public void setDmtcCourseName(String dmtcCourseName) {
        this.dmtcCourseName = dmtcCourseName;
    }

    public Integer getDmtcSchoolId() {
        return dmtcSchoolId;
    }

    public void setDmtcSchoolId(Integer dmtcSchoolId) {
        this.dmtcSchoolId = dmtcSchoolId;
    }

    public Integer getDmtcClassId() {
        return dmtcClassId;
    }

    public void setDmtcClassId(Integer dmtcClassId) {
        this.dmtcClassId = dmtcClassId;
    }


}