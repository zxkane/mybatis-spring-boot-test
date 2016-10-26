package com.cn.zbb.service.impl;

import com.cn.zbb.dao.DmClassInfoDao;
import com.cn.zbb.model.DmClassInfo;
import com.cn.zbb.service.DmClassInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DmClassInfoServiceImpl implements DmClassInfoService {
    @Autowired
    private DmClassInfoDao dmClassInfoDao;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return dmClassInfoDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(DmClassInfo record) {
        return dmClassInfoDao.insert(record);
    }

    @Override
    public int insertSelective(DmClassInfo record) {
        return dmClassInfoDao.insertSelective(record);
    }

    @Override
    public DmClassInfo selectByPrimaryKey(Integer id) {
        return dmClassInfoDao.selectByPrimaryKey(id);
    }

    @Override
    public DmClassInfo selectByGUID(DmClassInfo record) {

        return dmClassInfoDao.selectByGUID(record);
    }

    @Override
    public int updateByPrimaryKeySelective(DmClassInfo record) {
        return dmClassInfoDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(DmClassInfo record) {
        return dmClassInfoDao.updateByPrimaryKey(record);
    }

    @Override
    public List<DmClassInfo> getClassInfoBySchoolId(Integer dmciSchoolId) {
        return dmClassInfoDao.getClassInfoBySchoolId(dmciSchoolId);
    }

    @Override
    public List<DmClassInfo> getteacherByClassId(Integer dmciid) {
        // TODO Auto-generated method stub
        return dmClassInfoDao.getteacherByClassId(dmciid);
    }

    @Override
    public List<DmClassInfo> getHeadTeacherInfoBySchoolId(Integer dmciSchoolId) {
        // TODO Auto-generated method stub
        return dmClassInfoDao.getHeadTeacherInfoBySchoolId(dmciSchoolId);
    }

    @Override
    public List<DmClassInfo> getHeadTeacherBySchoolId(Integer dmciSchoolId) {
        // TODO Auto-generated method stub
        return dmClassInfoDao.getHeadTeacherBySchoolId(dmciSchoolId);
    }

    @Override
    public List<DmClassInfo> getTeacherInfoBySchoolId(Integer dmciSchoolId) {
        // TODO Auto-generated method stub
        return dmClassInfoDao.getTeacherInfoBySchoolId(dmciSchoolId);
    }


}