-- Find Employees Having Same Salary Pattern as Another

-- Table:
-- Employee(emp_id, dept_id, month, salary)

SELECT e1.emp_id AS emp1, e2.emp_id AS emp2, e1.dept_id
FROM Employee e1
JOIN Employee e2 ON e1.dept_id = e2.dept_id AND e1.emp_id < e2.emp_id
GROUP BY e1.emp_id, e2.emp_id, e1.dept_id
HAVING SUM(CASE WHEN e1.salary = e2.salary THEN 0 ELSE 1 END) = 0;
