-- Table: Employee(emp_id, name, salary)

-- Goal: Get the 2nd highest salary (without using LIMIT or TOP).

SELECT MAX(salary)
FROM Employee
WHERE salary < (SELECT MAX(salary) FROM Employee);
