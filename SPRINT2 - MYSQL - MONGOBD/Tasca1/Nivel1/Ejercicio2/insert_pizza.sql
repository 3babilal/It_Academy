
INSERT INTO province (province_name) VALUES ('Barcelona');
INSERT INTO province (province_name) VALUES ('Madrid');
INSERT INTO province (province_name) VALUES ('Valencia');
INSERT INTO province (province_name) VALUES ('Sevilla');
INSERT INTO province (province_name) VALUES ('Zaragoza');
INSERT INTO province (province_name) VALUES ('Málaga');
INSERT INTO province (province_name) VALUES ('Bilbao');
INSERT INTO province (province_name) VALUES ('Murcia');
INSERT INTO province (province_name) VALUES ('Las Palmas');
INSERT INTO province (province_name) VALUES ('A Coruña');

INSERT INTO city (city_name, id_province) VALUES ('Barcelona', 1);
INSERT INTO city (city_name, id_province) VALUES ('Madrid', 2);
INSERT INTO city (city_name, id_province) VALUES ('Valencia', 3);
INSERT INTO city (city_name, id_province) VALUES ('Sevilla', 4);
INSERT INTO city (city_name, id_province) VALUES ('Zaragoza', 5);
INSERT INTO city (city_name, id_province) VALUES ('Málaga', 6);
INSERT INTO city (city_name, id_province) VALUES ('Bilbao', 7);
INSERT INTO city (city_name, id_province) VALUES ('Murcia', 8);
INSERT INTO city (city_name, id_province) VALUES ('Las Palmas de Gran Canaria', 9);
INSERT INTO city (city_name, id_province) VALUES ('A Coruña', 10);


INSERT INTO customer (customer_name, last_name, address, zip_code, id_city, id_province, phone_number)
VALUES ('Juan', 'Perez', 'Calle Mayor, 123', '08001', 1, 1, 1234567890);
INSERT INTO customer (customer_name, last_name, address, zip_code, id_city, id_province, phone_number)
VALUES ('Maria', 'Garcia', 'Calle Valencia, 456', '46007', 3, 3, 987654321);
INSERT INTO customer (customer_name, last_name, address, zip_code, id_city, id_province, phone_number)
VALUES ('Pedro', 'Ruiz', 'Calle Toledo, 345', '41003', 4, 4, 2345678901);
INSERT INTO customer (customer_name, last_name, address, zip_code, id_city, id_province, phone_number)
VALUES ('Laura', 'Fernández', 'Plaza Mayor, 7', '37002', 5, 5, 3456789012);
INSERT INTO customer (customer_name, last_name, address, zip_code, id_city, id_province, phone_number)
VALUES ('Pablo', 'Muñoz', 'Avenida del Mar, 100', '07014', 1, 1, 4567890123);
INSERT INTO customer (customer_name, last_name, address, zip_code, id_city, id_province, phone_number)
VALUES ('Marta', 'Blanco', 'Calle Norte, 56', '24001', 2, 2, 5678901234);
INSERT INTO customer (customer_name, last_name, address, zip_code, id_city, id_province, phone_number)
VALUES ('Sandra', 'Romero', 'Calle Sur, 12', '18001', 3, 3, 6789012345);
INSERT INTO customer (customer_name, last_name, address, zip_code, id_city, id_province, phone_number)
VALUES ('Luis', 'Suárez', 'Calle Este, 89', '50009', 6, 6, 7890123456);
INSERT INTO customer (customer_name, last_name, address, zip_code, id_city, id_province, phone_number)
VALUES ('Inés', 'Gómez', 'Calle Oeste, 321', '08028', 1, 1, 8901234567);
INSERT INTO customer (customer_name, last_name, address, zip_code, id_city, id_province, phone_number)
VALUES ('Ana', 'Lopez', 'Calle Serrano, 789', '28006', 2, 2, 0123456789);


INSERT INTO pizza_category (category_name) VALUES ('Clásica');
INSERT INTO pizza_category (category_name) VALUES ('Especial');
INSERT INTO pizza_category (category_name) VALUES ('Vegetariana');
INSERT INTO pizza_category (category_name) VALUES ('Carnívora');
INSERT INTO pizza_category (category_name) VALUES ('Gourmet');
INSERT INTO pizza_category (category_name) VALUES ('Sin Gluten');

INSERT INTO product (product_name, product_descriptio, image, price, id_category)
VALUES ('DRINK', 'Bebida refrescante de limón y lima.', NULL, 2.00, NULL);
INSERT INTO product (product_name, product_descriptio, image, price, id_category)
VALUES ('DRINK', 'Bebida refrescante de cola.', NULL, 2.00, NULL);
INSERT INTO product (product_name, product_descriptio, image, price, id_category)
VALUES ('DRINK', 'Zumo de naranja natural.', NULL, 3.00, NULL);
INSERT INTO product (product_name, product_descriptio, image, price, id_category)
VALUES ('DRINK', 'Cerveza rubia nacional.', NULL, 2.50, NULL);
INSERT INTO product (product_name, product_descriptio, image, price, id_category)
VALUES ('PIZZA', 'Pizza clásica con salsa de tomate, mozzarella fresca y albahaca.', NULL, 12.50, 1);
INSERT INTO product (product_name, product_descriptio, image, price, id_category)
VALUES ('PIZZA', 'Pizza con mozzarella, gorgonzola, queso parmesano y queso fontina.', NULL, 13.50, 1);
INSERT INTO product (product_name, product_descriptio, image, price, id_category)
VALUES ('PIZZA', 'Pizza con verduras variadas como champiñones, pimientos, cebollas y aceitunas.', NULL, 11.50, 3);
INSERT INTO product (product_name, product_descriptio, image, price, id_category)
VALUES ('PIZZA', 'Pizza con pepperoni picante.', NULL, 12.00, 1);
INSERT INTO product (product_name, product_descriptio, image, price, id_category)
VALUES ('HAMBURGUESA', 'Hamburguesa con carne de vacuno, queso, lechuga, tomate y cebolla.', NULL, 10.00, NULL);
INSERT INTO product (product_name, product_descriptio, image, price, id_category)
VALUES ('HAMBURGUESA', 'Hamburguesa con carne de vacuno, queso, lechuga, tomate, cebolla y queso cheddar.', NULL, 11.00, NULL);



INSERT INTO store (address, zip_code, id_city, id_province)
VALUES ('123 Main Street', '10001', 1, 2); 
INSERT INTO store (address, zip_code, id_city, id_province)
VALUES ('456 Elm Street', '98765', 1, 3);
INSERT INTO store (address, zip_code, id_city, id_province)
VALUES ('789 Oak Avenue', '24680', 2, 1);
INSERT INTO store (address, zip_code, id_city, id_province)
VALUES ('1011 Beach Road', '35790', 3, 2);
INSERT INTO store (address, zip_code, id_city, id_province)
VALUES ('1234 Central Street', '46801', 1, 3);
INSERT INTO store (address, zip_code, id_city, id_province)
VALUES ('567 Elm Street', '57912', 4, 4);
INSERT INTO store (address, zip_code, id_city, id_province)
VALUES ('890 Pine Lane', '68023', 2, 1);

INSERT INTO employee (employee_name, last_name, nif, phone_number, position, id_store)
VALUES ('John', 'Doe', '12345678A', 1234567890, 'cuiner', 1);
INSERT INTO employee (employee_name, last_name, nif, phone_number, position, id_store)
VALUES ('Jane', 'Smith', '87654321B', 9876543210, 'repartidor', 2);
INSERT INTO employee (employee_name, last_name, nif, phone_number, position, id_store)
VALUES ('Michael', 'Brown', '24680135C', 2345678901, 'cuiner', 3);
INSERT INTO employee (employee_name, last_name, nif, phone_number, position, id_store)
VALUES ('Sarah', 'Jones', '57912346D', 5678901234, 'repartidor', 1);
INSERT INTO employee (employee_name, last_name, nif, phone_number, position, id_store)
VALUES ('David', 'Miller', '09876543E', 8901234567, 'cuiner', 2);

INSERT INTO command (registration_date, take_away, number_products, total_price, id_customer, id_delivery, id_store, id_product)
VALUES ('2023-11-29 10:30:00', 'YES', 2, 15.50, 1, 2, 1, 3);
INSERT INTO command (registration_date, take_away, number_products, total_price, id_customer, id_delivery, id_store, id_product)
VALUES ('2023-11-30 12:15:00', 'NO', 1, 12.00, 3, 1, 2, 1);
INSERT INTO command (registration_date, take_away, number_products, total_price, id_customer, id_delivery, id_store, id_product)
VALUES ('2023-12-01 17:00:00', 'YES', 3, 21.00, 2, 1, 1, 2);
INSERT INTO command (registration_date, take_away, number_products, total_price, id_customer, id_delivery, id_store, id_product)
VALUES ('2023-12-02 11:45:00', 'NO', 1, 9.50, 1, 2, 2, 4);
INSERT INTO command (registration_date, take_away, number_products, total_price, id_customer, id_delivery, id_store, id_product)
VALUES ('2023-12-03 15:30:00', 'YES', 4, 27.00, 3, 2, 3, 5);











