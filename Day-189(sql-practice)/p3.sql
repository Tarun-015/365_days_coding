-- Get each department’s highest-paid employee name + salary in one query.

-- SELECT e.name, e.dept_id, e.salary
FROM Employee e
WHERE (e.dept_id, e.salary) IN (
  SELECT dept_id, MAX(salary)
  FROM Employee
  GROUP BY dept_id
);