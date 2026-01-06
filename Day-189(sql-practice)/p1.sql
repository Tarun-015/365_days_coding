-- Retrieve Top 3 Salaries per Department
SELECT emp_id, name, dept_id, salary
FROM (
    SELECT emp_id, name, dept_id, salary,
           DENSE_RANK() OVER (PARTITION BY dept_id ORDER BY salary DESC) AS rnk
    FROM Employee
) ranked
WHERE rnk <= 3;