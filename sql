/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.7.25 : Database - security-test
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`security-test` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

USE `security-test`;

/*Table structure for table `sys_menu` */

DROP TABLE IF EXISTS `sys_menu`;

CREATE TABLE `sys_menu` (
  `code` varchar(32) NOT NULL COMMENT '主键ID',
  `name` varchar(32) DEFAULT NULL COMMENT '菜单名称',
  `parent_id` varchar(32) DEFAULT NULL COMMENT '父ID',
  `url` varchar(256) DEFAULT NULL COMMENT '菜单链接',
  `type` tinyint(4) DEFAULT NULL COMMENT '类型 0：目录 1：菜单 2：按钮',
  `order_num` int(11) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sys_menu` */

insert  into `sys_menu`(`code`,`name`,`parent_id`,`url`,`type`,`order_num`) values ('auth','权限管理','0',NULL,0,NULL),('auth:menu','菜单管理','auth','/menu',1,NULL),('auth:role','角色权限','auth','/role',1,NULL),('auth:user','用户管理','auth',NULL,1,NULL);

/*Table structure for table `sys_role` */

DROP TABLE IF EXISTS `sys_role`;

CREATE TABLE `sys_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) DEFAULT NULL COMMENT '角色',
  `remark` varchar(500) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `sys_role` */

insert  into `sys_role`(`id`,`name`,`remark`) values (1,'管理员',NULL);

/*Table structure for table `sys_role_menu` */

DROP TABLE IF EXISTS `sys_role_menu`;

CREATE TABLE `sys_role_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT NULL COMMENT '角色ID',
  `menu_code` varchar(64) DEFAULT NULL COMMENT '菜单ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `sys_role_menu` */

insert  into `sys_role_menu`(`id`,`role_id`,`menu_code`) values (1,1,'auth:menu'),(2,1,'auth'),(3,1,'auth:role');

/*Table structure for table `sys_user` */

DROP TABLE IF EXISTS `sys_user`;

CREATE TABLE `sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '系统用户主键',
  `username` varchar(100) DEFAULT NULL COMMENT '系统用户登陆账号',
  `password` varchar(100) DEFAULT NULL COMMENT '系统用户登陆密码',
  `full_name` varchar(200) DEFAULT NULL COMMENT '系统用户全称',
  `enabled` tinyint(1) DEFAULT '1' COMMENT '系统用户启用（0-否，1-是）',
  `account_non_locked` tinyint(1) DEFAULT '1' COMMENT '账户非锁定（0-否，1-是）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='系统用户';

/*Data for the table `sys_user` */

insert  into `sys_user`(`id`,`username`,`password`,`full_name`,`enabled`,`account_non_locked`) values (1,'admin','$2a$10$VKblrkEe1cJUdELkFYGtu.vmAPizbs2vy8QBdOzRCGPdDzmcWJOA2','admin',1,1);

/*Table structure for table `sys_user_role` */

DROP TABLE IF EXISTS `sys_user_role`;

CREATE TABLE `sys_user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `role_id` int(11) DEFAULT NULL COMMENT '角色ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `sys_user_role` */

insert  into `sys_user_role`(`id`,`user_id`,`role_id`) values (1,1,1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
