--  Write an SQL query to find the name and jersey number of each player whose jersey number is the smallest number among all jersey numbers. [Database: FLIS]

SELECT name, jersey_no
FROM players
WHERE jersey_no = (SELECT MIN(jersey_no) FROM players)