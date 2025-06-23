-- Write an SQL statement to find the book titles and the number of copies of the books which has the word 'Management' in their title.

SELECT 
    bc.title, 
    COUNT(bcps.accession_no) AS number_of_copies
FROM 
    book_catalogue bc
JOIN 
    book_copies bcps ON bc.ISBN_no = bcps.ISBN_no
WHERE 
    bc.title LIKE '%Management%'
GROUP BY 
    bc.title;