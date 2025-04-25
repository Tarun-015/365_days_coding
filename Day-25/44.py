# Reverse First half in an even length tuple
# Given an even-length tuple t, return a new tuple where the first half of the tuple is reversed, and the second half remains unchanged.


# t = (1, 2, 3, 4, 5, 6)
# The first half (1, 2, 3) is reversed to (3, 2, 1), so the result is (3, 2, 1, 4, 5, 6).


def reverse_first_half(t: tuple) -> tuple:
    '''
    Given an even-length tuple, return a new tuple where the first half 
    is reversed, and the second half remains unchanged.

    Arguments:
    t: tuple - an even-length tuple.

    Return: tuple - a new tuple with the first half reversed.
    '''
    
    
    mid = len(t) // 2
    return t[:mid][::-1] + t[mid:]
    

