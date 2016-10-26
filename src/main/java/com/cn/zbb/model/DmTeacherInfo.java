package com.cn.zbb.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class DmTeacherInfo implements Serializable {
    private Integer dmtiId;

    private String dmtiTeacherName;

    private String dmtiSex;

    private String dmtiIdNumber;

    private String dmtiHomeAddress;

    private String dmtiTelephone;

    private String dmtiMailbox;

    private String dmtiEducation;

    private String dmtiQq;

    private String dmtiState;

    private Integer dmtiSchoolId;

    private String dmtiBirthday;

    private Date dmtiUpdateTime;

    private String dmtiGuid;


    private List<DmClassInfo> dmclass;


    public Integer getDmtiId() {
        return dmtiId;
    }

    public void setDmtiId(Integer dmtiId) {
        this.dmtiId = dmtiId;
    }

    public String getDmtiTeacherName() {
        return dmtiTeacherName;
    }

    public void setDmtiTeacherName(String dmtiTeacherName) {
        this.dmtiTeacherName = dmtiTeacherName == null ? null : dmtiTeacherName.trim();
    }

    public String getDmtiSex() {
        return dmtiSex;
    }

    public void setDmtiSex(String dmtiSex) {
        this.dmtiSex = dmtiSex == null ? null : dmtiSex.trim();
    }

    public String getDmtiIdNumber() {
        return dmtiIdNumber;
    }

    public void setDmtiIdNumber(String dmtiIdNumber) {
        this.dmtiIdNumber = dmtiIdNumber == null ? null : dmtiIdNumber.trim();
    }

    public String getDmtiHomeAddress() {
        return dmtiHomeAddress;
    }

    public void setDmtiHomeAddress(String dmtiHomeAddress) {
        this.dmtiHomeAddress = dmtiHomeAddress == null ? null : dmtiHomeAddress.trim();
    }

    public String getDmtiTelephone() {
        return dmtiTelephone;
    }

    public void setDmtiTelephone(String dmtiTelephone) {
        this.dmtiTelephone = dmtiTelephone == null ? null : dmtiTelephone.trim();
    }

    public String getDmtiMailbox() {
        return dmtiMailbox;
    }

    public void setDmtiMailbox(String dmtiMailbox) {
        this.dmtiMailbox = dmtiMailbox == null ? null : dmtiMailbox.trim();
    }

    public String getDmtiEducation() {
        return dmtiEducation;
    }

    public void setDmtiEducation(String dmtiEducation) {
        this.dmtiEducation = dmtiEducation == null ? null : dmtiEducation.trim();
    }

    public String getDmtiQq() {
        return dmtiQq;
    }

    public void setDmtiQq(String dmtiQq) {
        this.dmtiQq = dmtiQq == null ? null : dmtiQq.trim();
    }

    public String getDmtiState() {
        return dmtiState;
    }

    public void setDmtiState(String dmtiState) {
        this.dmtiState = dmtiState == null ? null : dmtiState.trim();
    }

    public Integer getDmtiSchoolId() {
        return dmtiSchoolId;
    }

    public void setDmtiSchoolId(Integer dmtiSchoolId) {
        this.dmtiSchoolId = dmtiSchoolId;
    }

    public String getDmtiBirthday() {
        return dmtiBirthday;
    }

    public void setDmtiBirthday(String dmtiBirthday) {
        this.dmtiBirthday = dmtiBirthday;
    }

    public Date getDmtiUpdateTime() {
        return dmtiUpdateTime;
    }

    public void setDmtiUpdateTime(Date dmtiUpdateTime) {
        this.dmtiUpdateTime = dmtiUpdateTime;
    }

    public String getDmtiGuid() {
        return dmtiGuid;
    }

    public void setDmtiGuid(String dmtiGuid) {
        this.dmtiGuid = dmtiGuid;
    }


    public List<DmClassInfo> getDmclass() {
        return dmclass;
    }

    public void setDmclass(List<DmClassInfo> dmclass) {
        this.dmclass = dmclass;
    }


}