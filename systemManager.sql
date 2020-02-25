/*
 Navicat Premium Data Transfer

 Source Server         : 49.235.20.164
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : 49.235.20.164:3306
 Source Schema         : systemManager

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 30/01/2020 14:03:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `depName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `spare1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `spare2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `spare3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `spare4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `spare5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1d20b767-7190-4df7-80ee-ebd5b360d764', '系统管理员', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `department` VALUES ('5e471708-4f47-4514-9fa9-ed18f08ae2af', '行政部', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `department` VALUES ('a00fdd1e-bc9b-4834-9599-514e83bd86b0', '人事部', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `department` VALUES ('b2717c43-92f2-453d-9300-cda25d9a4902', '融晶六部', NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for familyTb
-- ----------------------------
DROP TABLE IF EXISTS `familyTb`;
CREATE TABLE `familyTb`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `userId` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户id',
  `folkName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '家庭成员姓名',
  `folkSex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '家庭成员性别',
  `folkAge` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '家庭成员年龄',
  `folkRelation` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '与自己的关系',
  `spare1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `spare2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `spare3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `spare4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `spare5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of familyTb
-- ----------------------------
INSERT INTO `familyTb` VALUES ('1', '666', '王富贵1', '男', '30', '父', '15555555555', NULL, NULL, NULL, NULL);
INSERT INTO `familyTb` VALUES ('2012feda-977f-4883-93d1-a4afa49798b0', '2', '王富贵1', '男', '22', '父', '13888888888', NULL, NULL, NULL, NULL);
INSERT INTO `familyTb` VALUES ('a46d33d8-3c8c-4f6a-862f-18cd5e707c9b', '666', '王富贵2', '女', '30', '母', '16666666666', NULL, NULL, NULL, NULL);
INSERT INTO `familyTb` VALUES ('c9b6eae7-2fcf-48cd-abe8-9deb1a4f2704', '2', '王富贵2', '女', '22', '母', '13866666666', NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for kaoqinTb
-- ----------------------------
DROP TABLE IF EXISTS `kaoqinTb`;
CREATE TABLE `kaoqinTb`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `userId` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '员工id',
  `state` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '考勤状态',
  `spare1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `spare2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `spare3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `spare4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `spare5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of kaoqinTb
-- ----------------------------
INSERT INTO `kaoqinTb` VALUES ('231665f3-be96-402b-ad32-779d356d1f5f', 'a802aeb8-a789-4c95-9a67-8b3179a35cb8', '已签到', '2020-01-28', NULL, NULL, NULL, NULL);
INSERT INTO `kaoqinTb` VALUES ('24a5a32e-4290-4ab3-9911-9d6e6d7a5ab0', '666', '已签到', '2020-01-26', NULL, NULL, NULL, NULL);
INSERT INTO `kaoqinTb` VALUES ('433590f0-08b2-4ad8-9c51-3099c653316a', '666', '已签到', '2020-01-24', NULL, NULL, NULL, NULL);
INSERT INTO `kaoqinTb` VALUES ('8b722107-09a6-4a4e-a8f3-dfdfa974ae95', '666', '已签到', '2020-01-30', NULL, NULL, NULL, NULL);
INSERT INTO `kaoqinTb` VALUES ('a5b1f52f-6a65-4c27-88fa-b8dd89228dd5', '666', '已签到', '2020-01-28', NULL, NULL, NULL, NULL);
INSERT INTO `kaoqinTb` VALUES ('eabbff17-21f7-4de5-8acf-cb62cfb901d4', '666', '已签到', '2020-01-22', NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for recordTb
-- ----------------------------
DROP TABLE IF EXISTS `recordTb`;
CREATE TABLE `recordTb`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `userId` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '员工id',
  `describe1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '奖惩描述',
  `spare1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `spare2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `spare3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `spare4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `spare5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of recordTb
-- ----------------------------
INSERT INTO `recordTb` VALUES ('1', '666', '迟到', '2019-9-10', '1', NULL, NULL, NULL);
INSERT INTO `recordTb` VALUES ('2', '666', '加班', '2019-9-20', '0', NULL, NULL, NULL);
INSERT INTO `recordTb` VALUES ('3', '666', '玩手机', '2019-9-25', '1', NULL, NULL, NULL);
INSERT INTO `recordTb` VALUES ('4', '666', '加班', '2019-9-25', '0', NULL, NULL, NULL);
INSERT INTO `recordTb` VALUES ('5', '666', '迟到', '2019-10-10', '1', NULL, NULL, NULL);
INSERT INTO `recordTb` VALUES ('6', '666', '迟到', '2019-10-21', '1', NULL, NULL, NULL);

-- ----------------------------
-- Table structure for salaryTb
-- ----------------------------
DROP TABLE IF EXISTS `salaryTb`;
CREATE TABLE `salaryTb`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `userId` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '员工id',
  `basicSalary` double(10, 2) NULL DEFAULT NULL COMMENT '基本工资',
  `bonus` double(10, 2) NULL DEFAULT NULL COMMENT '奖金',
  `deduct` double(10, 2) NULL DEFAULT NULL COMMENT '各项扣除',
  `realSalary` double(10, 2) NULL DEFAULT NULL COMMENT '实发工资',
  `state` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '发放状态',
  `spare1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `spare2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `spare3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `spare4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `spare5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of salaryTb
-- ----------------------------
INSERT INTO `salaryTb` VALUES ('1', '666', 5000.00, 500.00, 500.00, 5000.00, '已发放', '2019.12', NULL, NULL, NULL, NULL);
INSERT INTO `salaryTb` VALUES ('2', '666', 5000.00, 500.00, 300.00, 5200.00, '未发放', '2020.01', NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for userTb
-- ----------------------------
DROP TABLE IF EXISTS `userTb`;
CREATE TABLE `userTb`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `jobNumber` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '员工工号',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `department` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '部门名称',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '员工姓名',
  `sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '员工性别',
  `age` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '员工年龄',
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系方式',
  `state` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '岗位状态',
  `jurisdiction` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限',
  `spare1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `spare2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `spare3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `spare4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `spare5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of userTb
-- ----------------------------
INSERT INTO `userTb` VALUES ('2', 'admin', 'e10adc3949ba59abbe56e057f20f883e', '系统管理员', 'admin', '男', '0', '13888888888', '在职', '1', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `userTb` VALUES ('666', '26861', 'e10adc3949ba59abbe56e057f20f883e', '融晶六部', '李思螺', '男', '22', '13555555555', '在职', '0', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `userTb` VALUES ('a802aeb8-a789-4c95-9a67-8b3179a35cb8', '26860', 'e10adc3949ba59abbe56e057f20f883e', '行政部', '李思思', '男', '22', '17607103698', '在职', '0', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `userTb` VALUES ('d6c280ee-646e-476e-847c-677233f21b1e', '26811', 'e10adc3949ba59abbe56e057f20f883e', '人事部', '张螺螺', '男', '22', '13566666666', '在职', '0', NULL, NULL, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
