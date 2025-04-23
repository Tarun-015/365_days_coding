# Palindrome Integer
# Given an integer, check whether it is a palindrome. A palindrome is a number or a string that reads the same backward as forward.

# Assume the numbers are positive.

# Example

# is_palindrome(121) == True
# is_palindrome(123) == False
# is_palindrome(1212) == False

def is_palindrome(n: int) -> bool:
    '''Checks if an integer is a palindrome.

    Arguments:
    n: int - the integer to check

    Return:
    bool - True if the integer is a palindrome, False otherwise
    '''
    ...
    s = str(n)  # Convert the integer to a string
    return s == s[::-1]  # Compare the string with its reverse

