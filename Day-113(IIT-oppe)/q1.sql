-- university: Write an SQL query to find the building that belongs to the 'Biology' department. [Database: University] university:

SELECT building 
FROM department
WHERE dept_name = 'Biology'