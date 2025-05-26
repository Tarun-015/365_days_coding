-- Write an SQL statement to find the team_id of the players who were born before the year '2003'
SELECT team_id
FROM players
WHERE EXTRACT(YEAR FROM dob) < 2003