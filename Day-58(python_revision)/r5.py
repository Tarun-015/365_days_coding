# Write a Python function is_palindrome(s) that checks whether the input string s is a 
# palindrome. Return True or False.

def is_palindrome(s):
    s2=s[::-1]
    if s==s2:
        return True
    else:
        return False


user_str=input()
is_palindrome(user_str)