/*
 Navicat Premium Data Transfer

 Source Server         : criminal
 Source Server Type    : SQLite
 Source Server Version : 3030001
 Source Schema         : main

 Target Server Type    : SQLite
 Target Server Version : 3030001
 File Encoding         : 65001

 Date: 24/12/2020 17:04:51
*/

PRAGMA foreign_keys = false;

-- ----------------------------
-- Table structure for CRIMINAL
-- ----------------------------

-- ----------------------------
-- Records of CRIMINAL
-- ----------------------------
INSERT INTO "CRIMINAL" VALUES (1, 'Đi chơi trong ngày lễ', NULL, NULL, NULL, '2020/1/1');
INSERT INTO "CRIMINAL" VALUES (2, 'Tham gia lễ hội hóa trang Halloween', NULL, NULL, NULL, '2020/12/12');

-- ----------------------------
-- Auto increment value for CRIMINAL
-- ----------------------------
UPDATE "sqlite_sequence" SET seq = 2 WHERE name = 'CRIMINAL';

PRAGMA foreign_keys = true;
