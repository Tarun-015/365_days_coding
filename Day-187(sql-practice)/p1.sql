-- Find Running Total of Salary Using Window Functions
SELECT name, salary,
       SUM(salary) OVER (ORDER BY emp_id) AS running_total
FROM Employee;