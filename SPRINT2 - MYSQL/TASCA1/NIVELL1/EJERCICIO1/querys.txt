SELECT customer.customer_name AS customer,
COUNT(sale.id_sale) AS sales
FROM customer JOIN sale ON customer.id_customer = sale.id_customer
WHERE customer.mail ='ana.perez@email.com'
AND sale.registration_date BETWEEN '2024-01-01' AND '2024-06-01';

SELECT DISTINCT glasses.*
FROM sale 
JOIN glasses ON sale.id_glasses = glasses.id_glasses
WHERE id_employee =1
AND sale.registration_date BETWEEN '2024-01-01' AND '2025-01-01';

SELECT DISTINCT supplier.*
FROM sale
JOIN glasses ON sale.id_glasses = glasses.id_glasses
JOIN supplier ON supplier.id_supplier = supplier.id_supplier;





