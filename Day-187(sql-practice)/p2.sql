-- Find 3rd Highest Salary Using Window Functions
SELECT DISTINCT salary
FROM (
  SELECT salary,
         DENSE_RANK() OVER (ORDER BY salary DESC) AS rnk
  FROM Employee
) ranked
WHERE rnk = 3;