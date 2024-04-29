DROP DATABASE IF EXISTS spotify;
CREATE DATABASE spotify;
USE spotify;

CREATE TABLE customer(
id_customer INT PRIMARY KEY AUTO_INCREMENT,
mail VARCHAR(60),
customer_password VARCHAR (60),
customer_name VARCHAR (60),
born_date DATE,
gender ENUM ('M','F'),
customer_type ENUM('PREMIUM','REGULAR'),
country VARCHAR (60),
zip_code VARCHAR (60)
);
CREATE TABLE payment_card(
id_payment INT PRIMARY KEY AUTO_INCREMENT,
credit_number INT,
expiration_date DATE
);
CREATE TABLE payment_paypal(
id_payment INT PRIMARY KEY AUTO_INCREMENT,
customer_name VARCHAR(60)
);
CREATE TABLE payment_historial(
id_historial INT PRIMARY KEY AUTO_INCREMENT,
id_card INT,
id_paypal INT,
total DOUBLE,
FOREIGN KEY (id_card) REFERENCES payment_card(id_payment),
FOREIGN KEY (id_paypal) REFERENCES payment_paypal(id_paypal)
);
CREATE TABLE subcription(
id_subcription INT PRIMARY KEY AUTO_INCREMENT,
id_customer INT,
renew_date DATE,
payment ENUM('CREDIT','PAYPAL')
);

CREATE TABLE playlist(
id_list INT PRIMARY KEY AUTO_INCREMENT,
title VARCHAR(60),
songs_number INT,
creation_date DATE,
list_status ENUM('ACTIVE','DELETED'),
FOREIGN KEY (id_list) REFERENCES playlist(id_list)
);

CREATE TABLE sharelist(
id_share INT PRIMARY KEY AUTO_INCREMENT,
id_customer INT,
id_list INT,
add_date DATE,
FOREIGN KEY (id_list) REFERENCES playlist(id_list),
FOREIGN KEY (id_customer) REFERENCES customer(id_customer)
);
CREATE TABLE album(
id_album INT PRIMARY KEY AUTO_INCREMENT,
title VARCHAR(60),
date_published DATE,
cover BLOB
);
CREATE TABLE song(
id_song INT PRIMARY KEY AUTO_INCREMENT,
title VARCHAR(60),
length DOUBLE,
id_album INT,
FOREIGN KEY (id_album) REFERENCES album(id_album)
);
CREATE TABLE views(
id_views INT PRIMARY KEY AUTO_INCREMENT,
id_customer INT,
id_song INT,
FOREIGN KEY (id_song) REFERENCES song(id_song),
FOREIGN KEY (id_customer) REFERENCES customer(id_customer)
);

CREATE TABLE artist(
id_artist INT PRIMARY KEY AUTO_INCREMENT,
artist_name VARCHAR(60),
image BLOB
);
CREATE TABLE colaboration(
id_colaboration INT,
id_artist INT,
FOREIGN KEY (id_artist) REFERENCES artist(id_artist)
);
CREATE TABLE follow(
id_follow INT PRIMARY KEY AUTO_INCREMENT,
id_customer INT,
id_artist INT,
FOREIGN KEY (id_customer) REFERENCES customer(id_customer),
FOREIGN KEY (id_artist) REFERENCES artist(id_artist)
);

CREATE TABLE favorite(
id_favorite INT,
id_customer INT,
id_album INT,
id_song INT,
FOREIGN KEY (id_customer) REFERENCES customer (id_customer),
FOREIGN KEY (id_album) REFERENCES album (id_album),
FOREIGN KEY (id_song) REFERENCES song (id_song)
);
