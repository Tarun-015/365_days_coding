# Swap Alternate Elements in a Tuple
# Write a function to swap every alternate of adjacent elements in the tuple.

# Assume the length of the tuple is even.

# Examples

# >>> swap_alternate_elements((1, 2, 3, 4, 5, 6))
# (2, 1, 4, 3, 6, 5)
# >>> swap_alternate_elements(('a', 'b', 'c', 'd'))
# ('b', 'a', 'd', 'c')

def swap_alternate_elements(input_tuple):
  """
  Swaps every alternate pair of adjacent elements in the tuple.

  Args:
    input_tuple: The input tuple (assumed to have an even length).

  Returns:
    A new tuple with swapped elements.
  """
  
  result_list = list(input_tuple)  # Convert to list for easy swapping
  
  for i in range(0, len(result_list) - 1, 2):  # Iterate with a step of 2
    result_list[i], result_list[i + 1] = result_list[i + 1], result_list[i]  # Swap elements
    
  return tuple(result_list)  # Convert back to tuple

