DROP DATABASE IF EXISTS pizzeria;
CREATE DATABASE pizzeria;
USE pizzeria;

CREATE TABLE province(
	id_province INT PRIMARY KEY AUTO_INCREMENT,
	province_name VARCHAR(60)
);
CREATE TABLE city(
	 id_city INT PRIMARY KEY AUTO_INCREMENT,
	 city_name VARCHAR(60),
	 id_province INT,
	 FOREIGN KEY (id_province) REFERENCES province(id_province)
);
 
CREATE TABLE customer(
	id_customer INT PRIMARY KEY AUTO_INCREMENT,
	customer_name VARCHAR(60),
	last_name VARCHAR(60),
	address VARCHAR(60),
	zip_code VARCHAR(15),
	id_city INT,
	id_province INT,
	phone_number INT (11),
	FOREIGN KEY (id_city) REFERENCES city(id_city),
	FOREIGN KEY (id_province) REFERENCES province(id_province)
);
 
 CREATE TABLE pizza_category(
	 id_category INT PRIMARY KEY AUTO_INCREMENT,
	 category_name VARCHAR(60)
);
 CREATE TABLE product(
 id_product INT PRIMARY KEY AUTO_INCREMENT,
 product_name ENUM('PIZZA','HAMBURGUESA','DRINK'),
 product_descriptio VARCHAR(60),
 image BLOB,
 price DOUBLE,
 id_category INT,
 FOREIGN KEY (id_category) REFERENCES pizza_category(id_category)
 );
 
 CREATE TABLE store(
	 id_store INT PRIMARY KEY AUTO_INCREMENT,
	 address VARCHAR(60),
	 zip_code VARCHAR(15),
	 id_city INT,
	 id_province INT,
	 FOREIGN KEY (id_province) REFERENCES province(id_province),
	 FOREIGN KEY (id_city) REFERENCES city(id_city)
 );
 
   CREATE TABLE employee(
	 id_employee INT PRIMARY KEY AUTO_INCREMENT,
	 employee_name VARCHAR(60),
	 last_name VARCHAR(60),
	 nif VARCHAR(12),
	 phone_number INT(13),
	 position ENUM('cuiner','repartidor'),
	 id_store INT,
	 FOREIGN KEY (id_store) REFERENCES store(id_store)
 );
 
  CREATE TABLE command(
	 id_command INT PRIMARY KEY AUTO_INCREMENT,
	 registration_date DATETIME,
	 take_away ENUM('YES','NO'),
	 number_products INT,
	 total_price FLOAT,
	 id_customer INT,
	 id_delivery INT,
     id_product INT,
     id_store INT,
	 FOREIGN KEY (id_customer) REFERENCES customer (id_customer),
	 FOREIGN KEY (id_delivery) REFERENCES employee (id_employee),
     FOREIGN KEY (id_store) REFERENCES store (id_store),
     FOREIGN KEY (id_product) REFERENCES product(id_product)
 );
  


 
 

 
 
 