-- Write an SQL query to find the team ID and the number of players of each team.[Database: FLIS] 

select team_id,count(*) as no_of_player
from players
group by team_id
