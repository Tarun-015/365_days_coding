-- Find Missing Sequence Numbers in a Table

-- Table: Orders(order_id INT)


SELECT t1.order_id + 1 AS missing_start
FROM Orders t1
LEFT JOIN Orders t2 ON t1.order_id + 1 = t2.order_id
WHERE t2.order_id IS NULL;
