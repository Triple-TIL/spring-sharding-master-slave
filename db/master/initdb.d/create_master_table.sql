CREATE DATABASE IF NOT EXISTS master_db;
USE master_db;

CREATE TABLE IF NOT EXISTS users_0 (
    id bigint NOT NULL AUTO_INCREMENT,
    user_id bigint DEFAULT NULL,
    name varchar(100) DEFAULT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB;

CREATE TABLE IF NOT EXISTS users_1 (
    id bigint NOT NULL AUTO_INCREMENT,
    user_id bigint DEFAULT NULL,
    name varchar(100) DEFAULT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB;


