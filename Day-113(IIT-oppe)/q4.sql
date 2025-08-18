-- :Write an SQL query to find the name of the manager of team 'Arawali'.[Database: FLIS]

select m.name from teams t
join managers m on t.team_id=m.team_id
where t.name= 'Arawali'