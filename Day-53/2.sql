-- Write an SQL statement to find the match numbers and fourth referees ID of the matches where assistant referee 1(assistant_referee_1) is 'R0002'

SELECT match_num, fourth_referee
FROM match_referees
WHERE assistant_referee_1 = 'R0002'