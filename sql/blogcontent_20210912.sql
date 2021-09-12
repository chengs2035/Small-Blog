/*
SQLyog Ultimate v8.32
MySQL - 5.7.35 : Database - ry-cloud
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ry-cloud` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */;

USE `ry-cloud`;

/*Table structure for table `small_blog_contents` */

DROP TABLE IF EXISTS `small_blog_contents`;

CREATE TABLE `small_blog_contents` (
  `blog_cid` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `blog_title` varchar(150) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '标题',
  `blog_slug` varchar(150) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '访问名',
  `blog_created` int(10) unsigned DEFAULT '0' COMMENT '创建时间',
  `blog_modified` int(10) unsigned DEFAULT '0' COMMENT '修改时间',
  `blog_text` longtext COLLATE utf8mb4_unicode_ci COMMENT '主体内容',
  `blog_order` int(10) unsigned DEFAULT '0' COMMENT '排序编号',
  `blog_template` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '模板id',
  `blog_type` varchar(16) COLLATE utf8mb4_unicode_ci DEFAULT 'post' COMMENT '主体类型',
  `blog_status` varchar(16) COLLATE utf8mb4_unicode_ci DEFAULT 'publish' COMMENT '主体状态',
  `blog_password` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '密码',
  `blog_commentsNum` int(10) unsigned DEFAULT '0' COMMENT '评论数量',
  `blog_allowComment` char(1) COLLATE utf8mb4_unicode_ci DEFAULT '0' COMMENT '是否允许评论',
  `blog_allowFeed` char(1) COLLATE utf8mb4_unicode_ci DEFAULT '0' COMMENT '是否允许feed',
  `blog_parent` int(10) unsigned DEFAULT '0' COMMENT '所属分类',
  `user_id` bigint(20) DEFAULT NULL COMMENT '操作用户',
  PRIMARY KEY (`blog_cid`),
  UNIQUE KEY `slug` (`blog_slug`),
  KEY `created` (`blog_created`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='smallblog主体内容表';

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('blog主体内容', '1061', '1', 'blogcontent', 'blogcontent/blogcontent/index', 1, 0, 'C', '0', '0', 'blogcontent:blogcontent:list', '#', 'admin', sysdate(), '', null, 'blog主体内容菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('blog主体内容查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'blogcontent:blogcontent:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('blog主体内容新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'blogcontent:blogcontent:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('blog主体内容修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'blogcontent:blogcontent:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('blog主体内容删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'blogcontent:blogcontent:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('blog主体内容导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'blogcontent:blogcontent:export',       '#', 'admin', sysdate(), '', null, '');