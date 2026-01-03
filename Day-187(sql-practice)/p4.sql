-- Find Duplicate Records in a Table

-- Table: Customers(id, name, email)

SELECT email, COUNT(*)
FROM Customers
GROUP BY email
HAVING COUNT(*) > 1;