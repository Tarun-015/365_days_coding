# Check if all the odd indices are alphabets and even indices are digits
# Given a string, check if all the odd indices are alphabets and the even indices are digits.

# Note: indices starts from 0.


def is_odd_indices_alpha_and_even_indices_digits(string: str) -> bool:
    '''
    Given a string, check if all the odd indices are alphabets and the even indices are digits.

    Note: indices starts from 0.

    Arguments:
    string: str - the input string

    Return:
    bool - True if all odd indices are alphabets and even indices are digits, else False
    '''
    
    for i, char in enumerate(string):
        if i % 2 == 0:  # Even index
            if not char.isdigit():
                return False
        else:  # Odd index
            if not char.isalpha():
                return False
    return True

