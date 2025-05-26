-- Write an SQL statement to find the jersey number of players from the team: 'Thunder'

SELECT jersey_no
FROM players
WHERE team_id = (
    SELECT team_id
    FROM teams
    WHERE name = 'Thunder'
)