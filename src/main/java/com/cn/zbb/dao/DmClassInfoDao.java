package com.cn.zbb.dao;

import com.cn.zbb.model.DmClassInfo;
import com.cn.zbb.model.DmTeacherClass;

import java.util.List;

public interface DmClassInfoDao {
    int deleteByPrimaryKey(Integer dmciId);

    int insert(DmClassInfo record);

    /*
     * 添加班级信息
     */
    int insertSelective(DmClassInfo record);

    /*
     * 根据班级id获取班级信息
     */
    DmClassInfo selectByPrimaryKey(Integer dmciId);

    /*
     * 根据guid获取班级信息
	 * */
    DmClassInfo selectByGUID(DmClassInfo record);

    /*
     * 修改班级信息
     */
    int updateByPrimaryKeySelective(DmClassInfo record);

    int updateByPrimaryKey(DmClassInfo record);

    /*
     * 根据学校id获取班级列表
     */
    List<DmClassInfo> getClassInfoBySchoolId(Integer dmciSchoolId);

    List<DmTeacherClass> getTeacherClassListByClassId(Integer dmtcClassId);

    List<DmClassInfo> getteacherByClassId(Integer dmciid);

    /*
     * 根据学校id获取班级列表以及班主任信息
     * */
    List<DmClassInfo> getHeadTeacherInfoBySchoolId(Integer dmciSchoolId);

    /*
     * 根据学校id获取该学校班主任信息
     * */
    List<DmClassInfo> getHeadTeacherBySchoolId(Integer dmciSchoolId);

    /*
     * 根据学校id获取班级列表级班级所对应的教师
     * */
    List<DmClassInfo> getTeacherInfoBySchoolId(Integer dmciSchoolId);
}