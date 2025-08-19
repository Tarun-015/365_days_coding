# Problem Statement:


# Write a Python program to print the ISBN numbers of books which are published in a given year. Here, the year is obtained as the value of function L(x) (given after the sample output) at x. You have to read the value of x from the input file "number.txt", and use it to find the value of L(x). Your program must assume that the file number.txt resides in the same folder as your Python program.


# You have to iterate through the list and print each value separately as shown in the output below: 

# 9789352921171
# 9789351343202
# 9789353333380
# The line function is given below:
# L2(x) = 2000 + 4*x


import psycopg2

# Step 1: Read x from file
with open("number.txt", "r") as f:
    x = int(f.read().strip())

# Step 2: Compute L2(x)
year = 2000 + 4 * x

# Step 3: Connect to PostgreSQL
conn = psycopg2.connect(
    dbname="your_db_name",
    user="your_username",
    password="your_password",
    host="localhost",   
    port="5432"
)

cur = conn.cursor()

# Step 4: Run SQL query
cur.execute("SELECT isbn FROM books WHERE year = %s", (year,))
rows = cur.fetchall()

# Step 5: Print ISBNs one per line
for row in rows:
    print(row[0])

# Cleanup
cur.close()
conn.close()
