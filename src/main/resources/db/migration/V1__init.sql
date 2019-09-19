CREATE TABLE IF NOT EXISTS `t_task` (
  `task_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `address` VARCHAR(255)  DEFAULT NULL,
  `date_time` datetime NOT NULL,
  `description` TEXT NOT NULL,
  `estimate` INT(10) DEFAULT NULL,
  `estimate_type` INT(2) NOT NULL,
  `mode` INT(2) NOT NULL,
  `title` VARCHAR(255) NOT NULL,
  `user_id` BIGINT(20) NOT NULL,
  `status` INT(2) NOT NULL,
  `sys_create_datetime` DATETIME DEFAULT NULL,
  `sys_create_program` VARCHAR(255) DEFAULT NULL,
  `sys_create_user` VARCHAR(255) DEFAULT NULL,
  `sys_update_datetime` DATETIME DEFAULT NULL,
  `sys_update_program` VARCHAR(255) DEFAULT NULL,
  `sys_update_user` VARCHAR(255) DEFAULT NULL,
  `sys_delete_flag` BIT(1) DEFAULT NULL,
  `sys_update_count` INT(10) DEFAULT NULL,
  PRIMARY KEY (`task_id`)
) ENGINE=InnoDB;