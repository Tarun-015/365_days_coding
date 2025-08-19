# In this question, you must write a Python program to output the name of the main referee for a given match date (in yyyy-mm-dd format). The input to your program is a file named “date.txt” that has the match date as the first word of the file. Your program must assume that date.txt resides in the same folder as your Python program. 


# The output name has to be formatted as follows. The last name is displayed followed by the initials of the first name, then a full stop, a space and then the initials of the middle name (if the middle name exists), followed by a full stop.

# For example, if the name of the main referee is “Kennedy Sapam”, the output must be ”Sapam K.” 

# If the name of the main referee is “Asit Kumar Sarkar”, the output must be ”Sarkar A. K.”


import psycopg2

# Step 1: Read match date from file
with open("date.txt", "r") as f:
    match_date = f.read().strip()

# Step 2: Connect to PostgreSQL
conn = psycopg2.connect(
    dbname="your_db_name",
    user="your_username",
    password="your_password",
    host="localhost",
    port="5432"
)

cur = conn.cursor()

# Step 3: Query the referee name for that match date
cur.execute("SELECT main_referee FROM matches WHERE match_date = %s", (match_date,))
row = cur.fetchone()

if row:
    full_name = row[0].strip().split()

    # Step 4: Extract last name + initials
    if len(full_name) == 1:
        # Single name (e.g., "Pelé")
        formatted = full_name[0]
    else:
        last_name = full_name[-1]
        initials = " ".join([name[0] + "." for name in full_name[:-1]])
        formatted = f"{last_name} {initials}"

    print(formatted)
else:
    print("No match found")

# Cleanup
cur.close()
conn.close()
