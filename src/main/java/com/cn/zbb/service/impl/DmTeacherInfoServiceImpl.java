package com.cn.zbb.service.impl;

import com.cn.zbb.dao.DmTeacherInfoDao;
import com.cn.zbb.model.DmTeacherClass;
import com.cn.zbb.model.DmTeacherInfo;
import com.cn.zbb.service.DmTeacherInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DmTeacherInfoServiceImpl implements DmTeacherInfoService {
    @Autowired
    private DmTeacherInfoDao dmTeacherInfoDao;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return dmTeacherInfoDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(DmTeacherInfo record) {
        return dmTeacherInfoDao.insert(record);
    }

    @Override
    public int insertSelective(DmTeacherInfo record) {
        return dmTeacherInfoDao.insertSelective(record);
    }

    @Override
    public DmTeacherInfo selectByPrimaryKey(Integer id) {
        return dmTeacherInfoDao.selectByPrimaryKey(id);
    }

    @Override
    public DmTeacherInfo selectByGUID(String dmtiGuid) {
        return dmTeacherInfoDao.selectByGUID(dmtiGuid);
    }

    @Override
    public int updateByPrimaryKeySelective(DmTeacherInfo record) {
        return dmTeacherInfoDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(DmTeacherInfo record) {
        return dmTeacherInfoDao.updateByPrimaryKey(record);
    }

    @Override
    public List<DmTeacherInfo> getTeacherInfoListBySchoolId(Integer schoolId) {
        return dmTeacherInfoDao.getTeacherInfoListBySchoolId(schoolId);
    }

    @Override
    public List<DmTeacherInfo> getSbroleuserByUserId(Integer userid) {
        // TODO Auto-generated method stub
        return dmTeacherInfoDao.getSbroleuserByUserId(userid);
    }

    @Override
    public List<DmTeacherClass> selectListByTeacherId(Integer dmtcTeacherId) {
        // TODO Auto-generated method stub
        return dmTeacherInfoDao.selectListByTeacherId(dmtcTeacherId);
    }

    @Override
    public List<DmTeacherInfo> getuserroleInfoByUserId(Integer userid) {
        // TODO Auto-generated method stub
        return dmTeacherInfoDao.getuserroleInfoByUserId(userid);
    }

}