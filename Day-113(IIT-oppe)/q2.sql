-- Write an SQL query to find the player IDs of the players whose name ends with 'a'.[Database: FLIS]

SELECT player_id 
FROM players
WHERE name LIKE '%a'
