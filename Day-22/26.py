# Check if ten digit even number
# Write a function to check if a number is a ten-digit even number.
# Also account for negative numbers discarding the sign.

# Examples

# >>> is_ten_digit_even(8769473839)
# False
# >>> is_ten_digit_even(928948)
# False
# >>> is_ten_digit_even(9289479278)
# True
# >>> is_ten_digit_even(-9289479278)
# True

def is_ten_digit_even(number):
  """
  Checks if a number is a ten-digit even number.

  Args:
    number: The number to check.

  Returns:
    True if the number is a ten-digit even number, False otherwise.
  """
  
  number = abs(number) # Discard the sign for negative numbers
  
  if 1000000000 <= number <= 9999999999 and number % 2 == 0:
    return True
  else:
    return False

# Examples
#print(is_ten_digit_even(8769473839))
#print(is_ten_digit_even(928948))
#print(is_ten_digit_even(9289479278))
#print(is_ten_digit_even(-9289479278))

