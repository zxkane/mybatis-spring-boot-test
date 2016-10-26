package com.cn.zbb.controller;

import com.cn.zbb.model.DmClassInfo;
import com.cn.zbb.service.DmClassInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/*
 * 班级信息
 */
@Controller
@RequestMapping("/DmClassInfo")
public class DmClassInfoController {
    protected Logger logger = LoggerFactory.getLogger(getClass());
    @Resource
    private DmClassInfoService dmClassInfoService;

    /*
     * 根据班级id获取班级信息
     * 白洪宇
     * */
    @RequestMapping(value = "/getClassInfo")
    @ResponseBody
    public void getClassInfo(HttpServletRequest request) {
        String dmci_Id = request.getParameter("DMCI_ID");
        DmClassInfo dmClassInfo = new DmClassInfo();
        dmClassInfo = dmClassInfoService.selectByPrimaryKey(Integer.parseInt(dmci_Id));
    }

}
