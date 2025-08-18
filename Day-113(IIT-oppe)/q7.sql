--  Write an SQL query to find player name, team name, team ID, manager name and date of birth of manager of each player whose jersey number is 49.[Database: FLIS]

select p.name,t.name,t.team_id,m.name,m.dob
from teams t
join players p on t.team_id=p.team_id
join managers m on t.team_id=m.team_id
where p.jersey_no=49