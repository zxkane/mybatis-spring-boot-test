package com.cn.zbb.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;
public class DmClassInfo implements Serializable {
	private Integer dmciId;

    private String dmciClassName;

    private Integer dmciTeacherId;

    private String dmciRemark;

    private Integer dmciSchoolId;
    
    private String dmciGradeName;
    
    private String dmciGradeType;
    
    private Date dmciUpdateTime;
    
    private String dmciGuid;

    private List<DmTeacherInfo> teacher;
    
    public Integer getDmciId() {
        return dmciId;
    }

    public void setDmciId(Integer dmciId) {
        this.dmciId = dmciId;
    }

    public String getDmciClassName() {
        return dmciClassName;
    }

    public void setDmciClassName(String dmciClassName) {
        this.dmciClassName = dmciClassName == null ? null : dmciClassName.trim();
    }

    public Integer getDmciTeacherId() {
        return dmciTeacherId;
    }

    public void setDmciTeacherId(Integer dmciTeacherId) {
        this.dmciTeacherId = dmciTeacherId;
    }

    public String getDmciRemark() {
        return dmciRemark;
    }

    public void setDmciRemark(String dmciRemark) {
        this.dmciRemark = dmciRemark == null ? null : dmciRemark.trim();
    }

    public Integer getDmciSchoolId() {
        return dmciSchoolId;
    }

    public void setDmciSchoolId(Integer dmciSchoolId) {
        this.dmciSchoolId = dmciSchoolId;
    }

	public String getDmciGradeName() {
		return dmciGradeName;
	}

	public void setDmciGradeName(String dmciGradeName) {
		this.dmciGradeName = dmciGradeName;
	}

	public String getDmciGradeType() {
		return dmciGradeType;
	}

	public void setDmciGradeType(String dmciGradeType) {
		this.dmciGradeType = dmciGradeType;
	}

	public Date getDmciUpdateTime() {
		return dmciUpdateTime;
	}

	public void setDmciUpdateTime(Date dmciUpdateTime) {
		this.dmciUpdateTime = dmciUpdateTime;
	}

	public String getDmciGuid() {
		return dmciGuid;
	}

	public void setDmciGuid(String dmciGuid) {
		this.dmciGuid = dmciGuid;
	}

	public List<DmTeacherInfo> getTeacher() {
		return teacher;
	}

	public void setTeacher(List<DmTeacherInfo> teacher) {
		this.teacher = teacher;
	}

	
	
}