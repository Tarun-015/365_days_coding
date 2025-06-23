 <!-- Write an SQL statement to find the match number of the match held on '2020-05-21' and the name of the fourth referee who refereed that match. Print match_num first, followed by respective fourth referee name. Note: fourth referee is to be obtained from the 'fourth_referee' attribute. -->

 SELECT 
    m.match_num, 
    r.name AS fourth_referee_name
FROM 
    matches m
JOIN 
    match_referees mr ON m.match_num = mr.match_num
JOIN 
    referees r ON mr.fourth_referee = r.referee_id
WHERE 
    m.match_date = '2020-05-21';
