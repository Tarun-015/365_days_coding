-- Write an SQL statement to find the first names and dob (student_fname, dob) of students who belong to the department with department code as 'ME' and who were born after '2003-06-15'.

SELECT student_fname, dob
FROM students
WHERE department_code = 'ME' AND dob > '2003-06-15'