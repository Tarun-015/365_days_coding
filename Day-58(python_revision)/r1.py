# Write a Python program that: 
# ● Takes a list of integers from the user. 
# ● Replaces all even numbers with their square. 
# ● Displays the final list. 

def sq_list(lst):
    for i in range(len(lst)):
        sq=lst[i]*lst[i]
        lst[i]=sq
    return lst

user_list = list(map(int, input().split()))
sq_list(user_list)