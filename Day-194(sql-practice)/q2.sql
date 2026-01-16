-- Detect Consecutive Attendance (3+ Days in a Row)

-- Table: Attendance(emp_id, attendance_date)

SELECT DISTINCT a1.emp_id
FROM Attendance a1
JOIN Attendance a2 ON a2.emp_id = a1.emp_id 
    AND a2.attendance_date = a1.attendance_date + INTERVAL '1 DAY'
JOIN Attendance a3 ON a3.emp_id = a1.emp_id 
    AND a3.attendance_date = a1.attendance_date + INTERVAL '2 DAY';
