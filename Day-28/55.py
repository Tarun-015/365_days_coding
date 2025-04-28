# Write a function named num_to_words that accepts a square matrix of single digit numbers as argument. Within the function, create a file named words.csv. Write the matrix to the file by replacing the digits with their corresponding words. For example, num_to_words([[1, 2], [3, 4]]) should create the file words.csv with the following contents:

# one,two
# three,four
# Note that the matrix will only have integers from 
# 0
# 0 to 
# 9
# 9, endpoints inclusive.

# (1) You do not have to accept input from the user or print the output to the console. You just have to write the function definition. However, within the function, you have to create a file named words.csv and write to it.

# (2) The last line of the file should not end with a '\n'. The last character of every other line in the file should end with a '\n'. This is a convention that we will be following in all questions that ask you to write to a file.

def num_to_words(mat):
    P = {0: 'zero', 1: 'one', 2: 'two',
    3: 'three', 4: 'four', 5: 'five',
    6: 'six', 7: 'seven', 8: 'eight',
    9: 'nine'}
    f = open('words.csv', 'w')
    n = len(mat)
    for i in range(n):
        for j in range(n):
            line = f'{P[mat[i][j]]}'
            # do not add a comma for the elements in the last column
            if j != n - 1:
                line += ','
            f.write(line)
        # go to the next line as long as you are not in the last line
        if i != n - 1:
            f.write('\n')    
    f.close()