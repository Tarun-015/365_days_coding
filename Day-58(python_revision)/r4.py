# Write a Python function that takes a string and returns a dictionary with the frequency of each 
# character in the string. 

def freq_str(str):
    dict_={}
    for i in str:
        if i not in dict_:
            dict_[i]=1
        else:
            dict_[i] += 1

    return dict_

user_str=input()
freq_str(user_str)