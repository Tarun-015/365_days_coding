-- Write an SQL statement to find the last names (faculty_lname) of female faculty who belong to the department: 'Mechanical Engineering'.

SELECT f.faculty_lname
FROM faculty f
JOIN departments d ON f.department_code = d.department_code
WHERE f.gender = 'F'
  AND d.department_name = 'Mechanical Engineering'
