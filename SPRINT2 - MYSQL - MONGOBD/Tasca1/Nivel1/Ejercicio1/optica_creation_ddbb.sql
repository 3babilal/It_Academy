DROP DATABASE IF EXISTS optica;
CREATE DATABASE optica;
USE optica;
-- CREACION BBDD optica

-- -----------------------------------------------------
-- Table Address
-- -----------------------------------------------------
CREATE TABLE address (
  id_address INT PRIMARY KEY AUTO_INCREMENT,
  street VARCHAR(60),
  street_number INT,
  flat INT,
  door VARCHAR(15),
  city VARCHAR(45),
  zip_code INT,
  country VARCHAR(45));

-- -----------------------------------------------------
-- Table Customer
-- -----------------------------------------------------
CREATE TABLE customer (
  id_customer INT PRIMARY KEY AUTO_INCREMENT,
  customer_name VARCHAR(45),
  phone_number INT(13),
  mail VARCHAR(45),
  registration_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  id_referral INT,
  id_address INT,
  FOREIGN KEY (id_referral) REFERENCES customer(id_customer),
  FOREIGN KEY (id_address) REFERENCES address(id_address));

-- -----------------------------------------------------
-- Table Employees
-- -----------------------------------------------------
CREATE TABLE employee (
  id_employee INT PRIMARY KEY AUTO_INCREMENT,
  employee_name VARCHAR(45),
  last_name VARCHAR(45),
  id_address INT,
  FOREIGN KEY (id_address) REFERENCES address (id_address));

-- -----------------------------------------------------
-- Table Supplier
-- -----------------------------------------------------
CREATE TABLE supplier (
  id_supplier INT PRIMARY KEY AUTO_INCREMENT,
  supplier_name VARCHAR(45),
  phone_number INT(13) ,
  fax INT(13),
  nif VARCHAR(9),
  id_address INT,
  FOREIGN KEY (id_address) REFERENCES address (id_address));

-- -----------------------------------------------------
-- Table Brand
-- -----------------------------------------------------
CREATE TABLE brand(
id_brand INT PRIMARY KEY AUTO_INCREMENT,
id_supplier INT,
brand_name VARCHAR(50),
FOREIGN KEY (id_supplier) REFERENCES supplier (id_supplier)
);
-- -----------------------------------------------------
-- Table Glasses
-- -----------------------------------------------------
CREATE TABLE glasses (
  id_glasses INT PRIMARY KEY AUTO_INCREMENT,
  graduation DOUBLE,
  frame SET('flotant', 'pasta', 'metall'),
  color VARCHAR(15),
  color_glass VARCHAR(15),
  price DOUBLE,
  id_brand INT,
  FOREIGN KEY (id_brand) REFERENCES brand (id_brand));

-- -----------------------------------------------------
-- Table Sale
-- -----------------------------------------------------
CREATE TABLE sale (
  id_sale INT PRIMARY KEY AUTO_INCREMENT,
  id_employee INT,
  id_customer INT,
  id_glasses INT,
  registration_date DATE,
  FOREIGN KEY (id_employee) REFERENCES employee (id_employee),
  FOREIGN KEY (id_customer) REFERENCES customer (id_customer),
  FOREIGN KEY (id_glasses) REFERENCES glasses (id_glasses));

