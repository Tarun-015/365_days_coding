# filename is a text file that contains a collection of words in lower case, one word on each line. Write a function named get_freq that accepts filename as argument. It should return a dictionary where the keys are distinct words in the file, the values are the frequencies of these words in the file.

# For example, given the following file:

# good
# great
# good
# work
# work
# The dictionary returned should be:

# {'good': 2, 'great': 1, 'work': 2}
# The order in which the words are added to the dictionary doesn't matter.

# (1) filename is a string variable that holds the name of the file. For example, in the first test case, it is filename = 'public_1.txt'.

# (2) You do not have to accept input from the console or print the output to the console. You just have to write the function definition.

def get_freq(filename):
    f = open(filename, 'r')
    freq = dict()
    for line in f:
        word = line.strip()
        if word not in freq:
            freq[word] = 0
        freq[word] += 1
    f.close()
    return freq