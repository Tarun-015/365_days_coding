-- Find Employees Who Joined in Last 3 Months

-- Table: Employee(name, join_date)

SELECT name, join_date
FROM Employee
WHERE join_date >= DATEADD(MONTH, -3, GETDATE());