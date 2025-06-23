-- Write an SQL statement to find the name of the eldest player in the team named 'Rainbow'

SELECT 
    p.name AS eldest_player_name
FROM 
    players p
JOIN 
    teams t ON p.team_id = t.team_id
WHERE 
    t.name = 'Rainbow'
ORDER BY 
    p.dob ASC
LIMIT 1;