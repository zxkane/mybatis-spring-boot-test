SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `dm_class_info`
-- ----------------------------
DROP TABLE IF EXISTS `dm_class_info`;
CREATE TABLE `dm_class_info` (
  `DMCI_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `DMCI_Class_Name` varchar(50) DEFAULT NULL COMMENT '班级名称(如：11级空调高一（2）班)',
  `DMCI_Teacher_ID` int(11) DEFAULT NULL COMMENT '班主任ID',
  `DMCI_Remark` varchar(500) DEFAULT NULL COMMENT '班级备注',
  `DMCI_School_ID` int(11) DEFAULT NULL COMMENT '学校ID',
  `DMCI_Grade_Name` varchar(20) DEFAULT NULL COMMENT '年级名称',
  `DMCI_Grade_Type` varchar(20) DEFAULT NULL COMMENT '年级类型',
  `DMCI_Update_Time` date DEFAULT NULL COMMENT '更新时间',
  `DMCI_GUID` varchar(200) DEFAULT NULL COMMENT 'GUID',
  PRIMARY KEY (`DMCI_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dm_class_info
-- ----------------------------

-- ----------------------------
-- Table structure for `dm_teacher_class`
-- ----------------------------
DROP TABLE IF EXISTS `dm_teacher_class`;
CREATE TABLE `dm_teacher_class` (
  `DMTC_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `DMTC_Teacher_ID` int(11) DEFAULT NULL COMMENT '教师ID',
  `DMTC_Class_ID` int(11) DEFAULT NULL COMMENT '班级ID',
  `DMTC_School_ID` int(11) DEFAULT NULL COMMENT '学校ID',
  `DMTC_Course_Name` varchar(50) DEFAULT NULL COMMENT '课程名称',
  PRIMARY KEY (`DMTC_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dm_teacher_class
-- ----------------------------


-- ----------------------------
-- Table structure for `dm_teacher_info`
-- ----------------------------
DROP TABLE IF EXISTS `dm_teacher_info`;
CREATE TABLE `dm_teacher_info` (
  `DMTI_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `DMTI_Teacher_Name` varchar(50) DEFAULT NULL COMMENT '教师实名',
  `DMTI_Birthday` varchar(50) DEFAULT NULL COMMENT '生日',
  `DMTI_Sex` varchar(10) DEFAULT NULL COMMENT '性别',
  `DMTI_ID_Number` varchar(50) DEFAULT NULL COMMENT '身份证号',
  `DMTI_Home_Address` varchar(200) DEFAULT NULL COMMENT '家庭地址',
  `DMTI_Telephone` varchar(20) DEFAULT NULL COMMENT '电话',
  `DMTI_Mailbox` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `DMTI_Education` varchar(20) DEFAULT NULL COMMENT '学历',
  `DMTI_QQ` varchar(20) DEFAULT NULL COMMENT 'QQ',
  `DMTI_State` varchar(10) DEFAULT NULL COMMENT '状态:0-正常（默认）、1-已离职、2-申请中、3-锁定',
  `DMTI_School_ID` int(11) DEFAULT NULL COMMENT '学校ID',
  `DMTI_Update_Time` date DEFAULT NULL COMMENT '更新时间',
  `DMTI_GUID` varchar(200) DEFAULT NULL COMMENT 'GUID',
  PRIMARY KEY (`DMTI_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dm_teacher_info
-- ----------------------------
