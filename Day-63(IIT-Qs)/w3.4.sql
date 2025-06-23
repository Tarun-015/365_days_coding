-- Write an SQL statement to find roll_no and member_no of all students who have issued (borrowed) books between '2021-08-02' and '2021-08-07'.

SELECT 
    s.roll_no,
    m.member_no
FROM 
    book_issue b
JOIN 
    members m ON b.member_no = m.member_no
JOIN 
    students s ON m.roll_no = s.roll_no
WHERE 
    b.doi BETWEEN '2021-08-02' AND '2021-08-07';