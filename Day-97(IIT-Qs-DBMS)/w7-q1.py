# -- In this question, you must write a Python program to output the name of the main referee for a given match date (in yyyy-mm-dd format). The input to your program is a file named “date.txt” that has the match date as the first word of the file. Your program must assume that date.txt resides in the same folder as your Python program. 


# -- The output name has to be formatted as follows. The last name is displayed followed by the initials of the first name, then a full stop, a space and then the initials of the middle name (if the middle name exists), followed by a full stop.

# -- For example, if the name of the main referee is “Kennedy Sapam”, the output must be ”Sapam K.” 

# -- If the name of the main referee is “Asit Kumar Sarkar”, the output must be ”Sarkar A. K.”


import sys
import psycopg2
import os

db_name = sys.argv[1]
user = os.environ.get('PGUSER')
password = os.environ.get("PGPASSWORD")
host = os.environ.get("PGHOST")
port = os.environ.get("PGPORT")

conn = psycopg2.connect(
    dbname=db_name,
    user=user,
    password=password,
    host=host,
    port=port
)

cur = conn.cursor()

with open('date.txt', 'r') as text:
    date = text.read().strip()  # Remove extra whitespace and newlines

    cur.execute("""WITH match_data AS ( 
                SELECT match_referees.match_num, match_referees.referee
                FROM matches
                INNER JOIN match_referees ON matches.match_num = match_referees.match_num
                WHERE matches.match_date = %s)
                SELECT referees.name
                FROM match_data
                INNER JOIN referees on match_data.referee = referees.referee_id""", (date,))
    
    row = cur.fetchone()
    if row is None:
        print("No referee found for the given date.")
        sys.exit(1)  # Exit script if no data is found

    referee_name = str(row[0])
    referee_name = referee_name.split(' ')
    referee_name.reverse()
    name_length = len(referee_name)

    formatted_name = ""
    if name_length == 2:
        formatted_name = referee_name[0] + " " + referee_name[1][0] + "."
    elif name_length == 3:
        formatted_name = referee_name[0] + " " + referee_name[2][0] + ". " + referee_name[1][0] + "."
    
    print(formatted_name)