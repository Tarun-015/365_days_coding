# Tuple Operations 
# Given a tuple of integers, write a function that returns: 
# ● The sum of all elements. 
# ● A new tuple with elements reversed. 

def sum_tup(tup):
    sum =0
    for i in tup:
        sum+=i
    return sum

def reverse_tup(tup):
    for i in range(len(tup)-1,-1,-1):
        print(tup[i], end=" ")
    

user_lup = tuple(map(int, input().split()))
print("Sum of tuple elements:", sum_tup(user_lup))
reverse_tup(user_lup)