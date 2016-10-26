package com.cn.zbb.service;

import com.cn.zbb.model.DmTeacherClass;
import com.cn.zbb.model.DmTeacherInfo;

import java.util.List;

public interface DmTeacherInfoService {
    int deleteByPrimaryKey(Integer id);

    int insert(DmTeacherInfo record);

    int insertSelective(DmTeacherInfo record);

    DmTeacherInfo selectByPrimaryKey(Integer id);

    DmTeacherInfo selectByGUID(String dmtiGuid);

    int updateByPrimaryKeySelective(DmTeacherInfo record);

    int updateByPrimaryKey(DmTeacherInfo record);

    List<DmTeacherInfo> getTeacherInfoListBySchoolId(Integer schoolId);

    List<DmTeacherInfo> getSbroleuserByUserId(Integer userid);

    List<DmTeacherClass> selectListByTeacherId(Integer dmtcTeacherId);

    List<DmTeacherInfo> getuserroleInfoByUserId(Integer userid);

}