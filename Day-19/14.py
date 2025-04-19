# You are tasked with writing a program that can handle various tasks based on the input. The first line of the input represents the task to be performed. The possible tasks are:

# factors - Find the factors of a number n (including 1 and itself) in ascending order.
# find_min - Take n numbers from the input and print the minimum number.
# prime_check - Check whether a given number is prime or not.
# is_sorted - Check if all characters of the given string from input are in alphabetical order. Print the output as "True" or "False" accordingly.
# any_true - Take n numbers from input and check if any of the numbers are divisible by 3. Print the output as "True" or "False" accordingly.
# manhattan - Take inputs directions such as "UP", "DOWN", "LEFT" and "RIGHT" from the input until the input is "STOP". Assume you are starting from (0,0) in a cartesian coordinate. Find the Manhattan distance between the starting point and the ending point by following the steps in the cartesian plane.
# Write a program to solve these tasks. Use loops where necessary.

# this is to ensure that you cannot use the built in any, all and min function for this exercise but you can use it in the OPPEs.
any = None 
all = None
min = None 

task = input()

if task == 'factors':
    n = int(input())
    if n > 0:
        for i in range(1, n + 1):
            if n % i == 0:
                print(i)

elif task == 'find_min':
    n = int(input())
    if n > 0:
        minimum = float('inf')
        for i in range(5):
            num = int(input())
            if num < minimum:
                minimum = num
        print(minimum)

elif task == 'prime_check':
    n = int(input())
    if n > 1:
        is_prime = True
        for i in range(2, int(n ** 0.5) + 1):
            if n % i == 0:
                is_prime = False
                break
        print(is_prime)
    else:
        print(False)

elif task == 'is_sorted':
    s = input()
    if len(s) > 0:
        for i in range(len(s) - 1):
            if s[i] > s[i + 1]:
                print('False')
                break
        else:
            print('True')

elif task == 'any_true':
    n = int(input())
    for i in range(n):
        num = int(input())
        if num % 3 == 0:
            print('True')
            break
    else:
        print('False')

elif task == 'manhattan':
    x, y = 0, 0
    while True:
        next_move = input().strip().upper()
        if next_move == 'UP':
            y += 1
        elif next_move == 'DOWN':
            y -= 1
        elif next_move == 'LEFT':
            x -= 1
        elif next_move == 'RIGHT':
            x += 1
        elif next_move == 'STOP':
            print(abs(x) + abs(y))
            break
        else:
            continue
