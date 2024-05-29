SELECT COUNT(p.product_name) AS DRINK , s.zip_code 
FROM  command c 
JOIN product p ON c.id_product = p.id_product 
JOIN store s ON c.id_store = s.id_store 
WHERE p.product_name = 'DRINK' AND s.zip_code = 10001;

SELECT e.employee_name AS EMPLOYEE_Name, COUNT(c.id_delivery) AS TOTAL_COMANDAS
FROM  command c 
JOIN employee e ON c.id_delivery = e.id_employee 
WHERE e.employee_name = 'Jane';