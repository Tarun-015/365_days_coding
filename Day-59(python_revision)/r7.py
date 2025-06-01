# Write a function min_max_avg(lst) that takes a list of numbers and returns the minimum, 
# maximum, and average. 

def min_max_avg(lst):
    max,min,sum=lst[0],lst[0],0
    for i in lst:
        if(i>max):
            max=i
        if(i<min):
            min=i
        sum+=i
    print(min,max,sum/len(lst))

user_list = list(map(int, input().split()))
min_max_avg(user_list)