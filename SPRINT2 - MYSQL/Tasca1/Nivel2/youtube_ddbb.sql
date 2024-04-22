DROP DATABASE IF EXISTS youtube;
CREATE DATABASE youtube;
USE youtube;

CREATE TABLE customer(
id_customer INT PRIMARY KEY AUTO_INCREMENT,
mail VARCHAR(60) NOT NULL,
customer_name VARCHAR(60) NOT NULL,
customer_password VARCHAR(120) NOT NULL,
born_date DATE,
gender ENUM('H','F'),
country VARCHAR(60),
zip_code VARCHAR(45)
);

CREATE TABLE video(
id_video INT PRIMARY KEY AUTO_INCREMENT,
titel VARCHAR(60),
video_description VARCHAR (60),
size DOUBLE,
video_name VARCHAR (60),
length TIME,
thumbnail VARCHAR(60),
play_count INT,
likes_count INT,
dislikes_count INT,
videos_status ENUM('public','ocult','private')
);
CREATE TABLE label(
id_label INT PRIMARY KEY AUTO_INCREMENT,
label_name VARCHAR(60),
id_customer INT,
label_date DATE,
FOREIGN KEY (id_customer) REFERENCES customer(id_customer)
);

CREATE TABLE channel(
id_channel INT PRIMARY KEY AUTO_INCREMENT,
channel_name VARCHAR(60),
channel_date DATE,
id_customer INT,
FOREIGN KEY (id_customer) REFERENCES customer(id_customer)
);

CREATE TABLE subscription(
id_subscription INT PRIMARY KEY AUTO_INCREMENT,
id_channel INT,
id_customer INT,
FOREIGN KEY (id_customer)  REFERENCES customer(id_customer)
);

CREATE TABLE like_video(
id_like INT PRIMARY KEY AUTO_INCREMENT,
id_customer INT,
like_date DATETIME,
FOREIGN KEY (id_customer) REFERENCES customer(id_customer)
);
CREATE TABLE dislike_video(
id_dislike INT PRIMARY KEY AUTO_INCREMENT,
id_customer INT,
dislike_date DATETIME,
FOREIGN KEY (id_customer) REFERENCES customer(id_customer)
);

CREATE TABLE play_list(
id_list INT PRIMARY KEY AUTO_INCREMENT,
list_name VARCHAR(60),
list_date DATE,
list_status ENUM('PUBLIC','PRIVATE'),
id_customer INT,
FOREIGN KEY (id_customer) REFERENCES customer(id_customer)
);

CREATE TABLE comment(
id_comment INT PRIMARY KEY AUTO_INCREMENT,
txt VARCHAR (250),
comment_date DATE,
id_customer INT,
FOREIGN KEY (id_customer) REFERENCES customer(id_customer)
);

CREATE TABLE like_comment(
id_like INT PRIMARY KEY AUTO_INCREMENT,
id_customer INT,
like_date DATETIME,
FOREIGN KEY (id_customer) REFERENCES customer(id_customer)
);
CREATE TABLE dislike_comment(
id_dislike INT PRIMARY KEY AUTO_INCREMENT,
id_customer INT,
dislike_date DATETIME,
FOREIGN KEY (id_customer) REFERENCES customer(id_customer)
);



