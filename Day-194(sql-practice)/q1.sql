-- Find the Median Salary of Each Department

-- -- Table: Employee(emp_id, name, salary, dept_id)

SELECT dept_id,
       AVG(salary) AS median_salary
FROM (
    SELECT dept_id, salary,
           ROW_NUMBER() OVER (PARTITION BY dept_id ORDER BY salary) AS rn,
           COUNT(*) OVER (PARTITION BY dept_id) AS cnt
    FROM Employee
) ranked
WHERE rn IN (FLOOR((cnt + 1) / 2.0), CEIL((cnt + 1) / 2.0))
GROUP BY dept_id;
