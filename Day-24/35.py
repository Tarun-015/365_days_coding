# Sorted string with common characters from two strings.
# Write a function to return a sorted string with unique common charecters present in the given two strings.

# Examples

# >>> common_char_sorted_str('apple', 'ball')
# 'al'
# >>> common_char_sorted_str('abcde', 'edfci')
# 'cde'

def common_char_sorted_str(str1, str2):
  """
  Returns a sorted string with unique common characters present in two strings.

  Args:
    str1: The first string.
    str2: The second string.

  Returns:
    A sorted string of unique common characters.
  """

  common_chars = set()  # Use a set to store unique characters

  for char in str1:
    if char in str2:
      common_chars.add(char)

  return "".join(sorted(list(common_chars)))  # Convert to list, sort, and join