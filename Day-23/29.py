# Even Characters first and Odd Characters reversed
# Given a string, return a string with the characters in the even indices first and the characters in the odd indices next but in reversed order.

# Example For the input "abcde",

# even chars = "ace"
# odd chars = "bd"; odd chars reversed = "db"
# result = "acedb"

def even_first_odd_reversed(s: str) -> str:
    '''Return a string with the characters in the even indices first 
    and the characters in the odd indices reversed next.

    Arguments:
    s: str - the input string

    Return:
    str - modified string

    Example:
    >>> even_first_odd_reversed('abcde')
    'acedb'
    >>> even_first_odd_reversed('python')
    'ptonhy'
    '''
    return s[::2] + s[1::2][::-1]