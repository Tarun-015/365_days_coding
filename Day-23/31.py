# Rotate a list K times
# Given a list of items and an integer k, rotate the list to the right by k steps.

# Consider that the list contains at least one item.

# Example

# >>> rotate_list([1, 2, 3, 4, 5], 2)
# [4, 5, 1, 2, 3]

def rotate_list(input_list, k):
  """
  Rotates a list to the right by k steps.

  Args:
    input_list: The list to rotate.
    k: The number of steps to rotate.

  Returns:
    A new list rotated by k steps.
  """
  
  n = len(input_list)
  k = k % n  # Handle cases where k > n

  rotated_list = input_list[-k:] + input_list[:-k]
  return rotated_list
