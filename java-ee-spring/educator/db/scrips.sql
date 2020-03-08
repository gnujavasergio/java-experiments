DROP DATABASE educator;

CREATE DATABASE educator;

CREATE TABLE teachers (
	id INT(11) NOT NULL AUTO_INCREMENT,
	name varchar(60) NOT NULL, 
	avatar varchar(150),
	PRIMERY KEY(id)
);

CREATE TABLE courses(
	id INTEGER(11) NOT NULL AUTO_INCREMENT,
	name VARCHAR(120) NOT NULL,
	content TEXT, 
	project TEXT,
	teacher_id INTEGER(11),
	PRIMARY KEY(id),
	FOREIGN KEY(teacher_id) REFERENCES tearchers(id) 
);

CREATE TABLE social_networks(
	id INT(11) NOT NULL AUTO_INCREMENT,
	name VARCHAR(30) NOT NULL,
	icon VARCHAR(150) NOT NULL,
	PRIMARY KEY(id)
);

CREATE TABLE networks(
	id INT(11) NOT NULL AUTO_INCREMENT,
	teacher_id NOT NULL,
	social_network_id NOT NULL, 
	nickname VARCHAR(30),
	PRIMARY KEY(id),
	FOREIGN KEY(teacher_id) REFERENCES tearchers(id),
	FOREIGN KEY(social_network_id) REFERENCES social_networks(id)
); 
