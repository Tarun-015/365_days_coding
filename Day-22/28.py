# Format Elements in tuple as "second, first"
# Given a tuple of length two create a string in the format of "second, first" where first and second are the first and second elements in the tuple.

# The elements can be of any data type.
# Change in eligibility criteria to write oppe2 exam: A5>=40/100 AND A6>=40/100 AND A7>=40/100 AND A8>=40/100. and becoming eligible to give the end term exam.

# Example

# >>> format_as_second_comma_first(('hello', 'python'))
# 'python, hello'
# >>> format_as_second_comma_first((1, 2))
# '2, 1'

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

