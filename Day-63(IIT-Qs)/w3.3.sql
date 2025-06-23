-- Write an SQL statement to find the names of teams that do not have any player with jersey number (jersey_no) 74.

SELECT 
    t.name AS team_name
FROM 
    teams t
WHERE 
    NOT EXISTS (
        SELECT 1 
        FROM players p 
        WHERE p.team_id = t.team_id AND p.jersey_no = 74
    );