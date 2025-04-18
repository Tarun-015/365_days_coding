# ✅ Important Note on while loop🔁:

# Use while only when the number of iterations is indefinite.
# If you can term the steps as do n times, do once for each item, etc. use for loop instead.
# If you can only term the steps as do until something happens. Like when user inputs 10.
# A bit of wisdom 📖 There are maily two ways in which while loops are used in the context of taking inputs until a terminal word.

# Method 1
# Method 2
# # method 1
# a = input()
# while a != terminal_word: # opposite of the terminal condition
#     # do something with a
#     a = input() # take the next a

# # method 2
# while True: # loop forever
#     a = input()
#     if a == terminal_word: # the terminal condition
#         break
#     # do something with a
# Problem Statement

# Problem type - Standard Input - Standard Output

# NOTE: None of this problem statements can be written using a for since the number of repetition is indefinite.

# Implement different parts of a multi-functional program based on an initial input value. Each part of the program will handle various tasks related to accumulation, filtering, mapping, and combinations of these operations. None of the tasks should use explicit loops for definite repetitions, and the program should handle indefinite inputs gracefully.

# Tasks

# Accumulation - Accumulating a final result
# sum_until_0: Continuously read integers from standard input until you receive a zero. Print the sum of these integers.
# total_price: Continuously read pairs of integers from standard input, representing the quantity and price of items, until you receive the string "END". Print the total price of all items.
# Filtering - Selecting based on a criterion
# only_ed_or_ing: Continuously read strings from standard input until you encounter the word "STOP" (case insensitive and not included in the output). Print only those strings that end with "ed" or "ing" (case insensitive).
# reverse_sum_palindrome: Continuously read positive integers from standard input until you encounter a "-1"(not included in the output). Print only those integers for which the sum of the number and its reverse is a palindrome.
# Mapping - Applying the same operation to different items
# double_string: Continuously read lines from standard input until an empty line is encountered. Print each line repeated twice.
# odd_char: Continuously read strings from standard input until you encounter a string ending with a "."(include that string with the "." in the output). Extract characters at odd positions (starting from 1) of each line, and print the results in a single line separated by spaces.
# Filter and Map - Applying an operation to selected items
# only_even_squares: Continuously read numbers from standard input until "NAN" is encountered. Print the square of each number only if it is even.
# Filter and Accumulate - Accumulating a result with selected items
# only_odd_lines: Continuously read lines from standard input until "END"(not included in the output) is encountered. Create a string by prepending only the odd lines (starting from 1) with a newline character in between, and print the result which will be the odd lines in reverse order.

# Note this prefix code is to verify that you are not using any for loops in this exercise. This won't affect any other functionality of the program.
with open(__file__) as f:
    content = f.read().split("# <eoi>")[2]
if "for " in content:
    print("You should not use for loop or the word for anywhere in this exercise")

# This is the first line of the exercise
task = input()
# <eoi>

if task == "sum_until_0":
    total = 0
    n = int(input())
    while n != 0: # the terminal condition
        total += n # add n to the total
        n = int(input()) # take the next n form the input
    print(total)

elif task == "total_price":
    total_price = 0
    while True: # repeat forever since we are breaking inside
        line = input()
        if line == "END": # The terminal condition
            break
        quantity, price = line.split() # split uses space by default
        quantity, price = int(quantity), int(price) # convert to ints
        total_price += quantity * price # accumulate the total price
    print(total_price)
elif task == "only_ed_or_ing":

    word = input()
    while word.lower() != "stop":
        if word.lower().endswith("ed") or word.lower()[-3:]=="ing": # both ways of doing it
            print(word)
        word = input()

elif task == "reverse_sum_palindrome":

    num = int(input())
    while num !=-1:
        rev_num = int(str(num)[::-1])
        num_sum = num+rev_num
        if str(num_sum) == str(num_sum)[::-1]:
            print(num)
        num = int(input())

elif task == "double_string":

    line = input()
    while line != "":
        print(line*2)
        line = input()

elif task == "odd_char":

    line = input()
    while line[-1] != ".":
        print(line[::2],end=" ")
        line = input()
    print(line[::2])

elif task == "only_even_squares":

    while True:
        line = input()
        if line == "NAN":
            break
        num = int(line)
        if num % 2 == 0:
            print(num * num)

elif task == "only_odd_lines":

    result  = ""
    line_no = 1
    while True:
        line = input()
        if line == "END":
            break
        if line_no%2:
            result = line + "\n" + result
        line_no+=1
    print(result)
