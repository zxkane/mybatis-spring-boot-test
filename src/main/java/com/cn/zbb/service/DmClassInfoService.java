package com.cn.zbb.service;

import com.cn.zbb.model.DmClassInfo;

import java.util.List;

public interface DmClassInfoService {
    int deleteByPrimaryKey(Integer id);

    int insert(DmClassInfo record);

    int insertSelective(DmClassInfo record);

    DmClassInfo selectByPrimaryKey(Integer id);

    DmClassInfo selectByGUID(DmClassInfo dmClassInfo);

    int updateByPrimaryKeySelective(DmClassInfo record);

    int updateByPrimaryKey(DmClassInfo record);

    List<DmClassInfo> getClassInfoBySchoolId(Integer dmciSchoolId);

    List<com.cn.zbb.model.DmClassInfo> getteacherByClassId(Integer dmciid);

    List<DmClassInfo> getHeadTeacherInfoBySchoolId(Integer dmciSchoolId);

    List<DmClassInfo> getHeadTeacherBySchoolId(Integer dmciSchoolId);

    List<DmClassInfo> getTeacherInfoBySchoolId(Integer dmciSchoolId);

}