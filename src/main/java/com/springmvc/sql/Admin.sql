-- auto Generated on 2018-06-01 11:22:13 
-- DROP TABLE IF EXISTS admin; 
CREATE TABLE admin(
	id INT (11) NOT NULL AUTO_INCREMENT COMMENT 'id',
	name VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'name',
	password VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'password',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'admin';
