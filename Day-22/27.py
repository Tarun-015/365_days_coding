# rithmetic Operations tuple from two integers
# Given a tuple of two integers (a, b), return a tuple containing the sum, difference, product, and quotient (integer division) of the two numbers.
# Example:

# >>> arithmetic_operations((1, 2))
# (3, -1, 2, 0)

# def arithmetic_operations(t: tuple) -> tuple:
#     '''
#     Given a tuple of two integers (a, b), return a tuple containing the 
#     sum, difference, product, and quotient (integer division) of the two numbers.

#     Arguments:
#     t: tuple - a tuple of two integers (a, b)

#     Return:
#     tuple - a tuple containing the sum, difference, product, and quotient

#     Example:
#     >>> arithmetic_operations((1, 2))
#     (3, -1, 2, 0)
#     '''
#     ...
    
#Strings 1

def format_as_second_comma_first(input_tuple):
  """
  Formats a tuple of length two into the string "second, first".

  Args:
    input_tuple: A tuple of length two.

  Returns:
    A string in the format "second, first".
  """
  
  second = str(input_tuple[1])  # Convert the second element to a string
  first = str(input_tuple[0])   # Convert the first element to a string
  
  return second + ", " + first

# Example Usage (from the problem description)
#print(format_as_second_comma_first(('hello', 'python')))
#print(format_as_second_comma_first((1, 2)))


#String 2
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