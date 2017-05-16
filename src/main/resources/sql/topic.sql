/*
Navicat MySQL Data Transfer

Source Server         : 我的MySql
Source Server Version : 50713
Source Host           : 119.29.223.16:3306
Source Database       : bbs

Target Server Type    : MYSQL
Target Server Version : 50713
File Encoding         : 65001

Date: 2017-05-16 21:52:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for topic
-- ----------------------------
DROP TABLE IF EXISTS `topic`;
CREATE TABLE `topic` (
  `topic_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '帖子 id',
  `topic_introduction` varchar(150) DEFAULT NULL COMMENT '帖子介绍',
  `topic_title` varchar(150) NOT NULL DEFAULT '' COMMENT '帖子标题',
  `topic_publish_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '帖子发布时间',
  `topic_content` text NOT NULL COMMENT '帖子内容',
  `topic_type` tinyint(4) NOT NULL DEFAULT '0' COMMENT '帖子类型。0 普通贴。1 精华贴；2 公告贴；',
  `topic_view_num` int(11) NOT NULL DEFAULT '0' COMMENT '帖子被查看数',
  `topic_status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '帖子状态。0 正常； 1 被删除。',
  `topic_good_num` int(11) NOT NULL DEFAULT '0' COMMENT '帖子点赞数',
  `user_id` int(11) NOT NULL COMMENT '帖子用户 id',
  `forum_id` int(11) NOT NULL,
  `prop1` varchar(255) DEFAULT NULL COMMENT '帖子申精状态，0 正在申精，1 申精被拒绝，2 申精通过，其他没有申精',
  `prop2` varchar(255) DEFAULT NULL,
  `prop3` varchar(255) DEFAULT NULL,
  `prop4` varchar(255) DEFAULT NULL,
  `prop5` varchar(255) DEFAULT NULL,
  `prop6` varchar(255) DEFAULT NULL,
  `prop7` varchar(255) DEFAULT NULL,
  `prop8` varchar(255) DEFAULT NULL,
  `prop9` varchar(255) DEFAULT NULL,
  `prop10` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`topic_id`),
  KEY `PK_topic_user_id` (`user_id`),
  KEY `PK_topic_forum_id` (`forum_id`),
  CONSTRAINT `PK_topic_forum_id` FOREIGN KEY (`forum_id`) REFERENCES `forum` (`forum_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `PK_topic_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
