-- Show Department with Highest Average Salary

-- Table: Employee(emp_id, name, salary, dept_id)

SELECT dept_id, AVG(salary) AS avg_sal
FROM Employee
GROUP BY dept_id
ORDER BY avg_sal DESC
LIMIT 1;