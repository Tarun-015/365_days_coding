-- Find Employees Who Earn More Than Their Manager

-- Table:
-- Employee(emp_id, name, salary, manager_id)

SELECT e.name AS employee, m.name AS manager
FROM Employee e
JOIN Employee m ON e.manager_id = m.emp_id
WHERE e.salary > m.salary;
