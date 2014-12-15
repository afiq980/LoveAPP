#create schema
CREATE SCHEMA loveAPP;

#select schema
USE loveAPP;

#create table
CREATE TABLE user(
 fullName varchar(100) not null,
 nickName varchar(100) not null,
 gender char(1) not null,
 hpNumber int not null,
 hNumber int,
 email varchar(100) not null primary key,
 password varchar(100) not null,
 company varchar(100),
 year int,
 admin boolean
) ENGINE = MYISAM;

CREATE TABLE shift(
 mall varchar(100) not null,
 datetime varchar(100) not null,
 duration int not null,
 assign varchar(100),
 primary key (mall, datetime)
) ENGINE = MYISAM;

CREATE TABLE assign(
 email varchar(100) not null,
 mall varchar(100) not null,
 datetime varchar(100) not null,
 timeIn varchar(100) not null,
 timeOut varchar(100) not null,
 approved boolean,
 primary key (email, mall, datetime)
) ENGINE = MYISAM;

CREATE TABLE mall(
 name varchar(100) not null,
 address varchar(300) not null,
 boothLocation varchar(100),
 description varchar(100),
 year int,
 primary key (name, year)
) ENGINE = MYISAM;

SET GLOBAL query_cache_size=0;

#add index
ALTER TABLE user
 ADD INDEX idx_email (email);

ALTER TABLE shift
 ADD INDEX idx_mall (mall),
 ADD INDEX idx_datetime (datetime);

ALTER TABLE assign
 ADD INDEX idx_email (email),
 ADD INDEX idx_mall (mall),
 ADD INDEX idx_datetime (datetime);
 
 ALTER TABLE mall
 ADD INDEX idx_name (name),
 ADD INDEX idx_year (year);