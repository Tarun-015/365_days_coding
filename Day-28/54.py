# filename is a CSV file that has the following header:

# Name,Country,Goals
# The first five lines of a sample file are given below:

# Name,Country,Goals                                        
# P1,Brazil,20  
# P2,Argentina,30
# P3,Brazil,50                                                   
# P4,Germany,30
# Write a function named get_goals that accepts filename and the name of a country as arguments. It should return a tuple having two elements: (num_players, num_goals). num_players is the number of players from this country that appear in this file, num_goals is the total number of goals scored by all the players who belong to this country. If the country is not present in the file, then return the tuple (-1, -1).

# (1) filename is a string variable that holds the name of the file. For example, in the first test case, it is filename = 'public_1.csv'.

# (2) Each player who represents a country has scored at least one goal. That is, the last column in the file will have only positive integers.

# (3) You do not have to accept input from the user or print the output to the console. You just have to write the function definition.

def get_goals(filename, country):
    f = open(filename, 'r')
    # Ignore the header
    f.readline()
    nplayers, ngoals = 0, 0
    for line in f:
        # Unpacking a list into three variables
        player, country_file, goals = line.split(',')
        if country_file == country:
            nplayers += 1
            ngoals += int(goals)
    f.close()
    if nplayers > 0:
        return (nplayers, ngoals)
    return (-1, -1)