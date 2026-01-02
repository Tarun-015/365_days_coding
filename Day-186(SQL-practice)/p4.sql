-- Get Employees with Higher Salary than Department Average

-- Table:
-- Employee(emp_id, name, salary, dept_id)

SELECT name, salary, dept_id
FROM Employee e
WHERE salary > (
  SELECT AVG(salary)
  FROM Employee
  WHERE dept_id = e.dept_id
);
