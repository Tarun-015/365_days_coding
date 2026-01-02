-- Goal: Find nth highest salary dynamically.

SELECT DISTINCT salary
FROM Employee e1
WHERE (
    SELECT COUNT(DISTINCT salary)
    FROM Employee e2
    WHERE e2.salary > e1.salary
) = 1; -- change 1 to (n-1)
