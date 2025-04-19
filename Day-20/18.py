# You are required to complete the following functions to perform various operations on tuples and lists.

# swap_halves: Swap the first and second halves of a tuple with an even length.
# Input: A tuple of even length.
# Output: A new tuple where the first and second halves are swapped.
# swap_at_index: Break a tuple at a given index ( k ) (the element at the ( k )-th index is included in the first half before swapping) and swap the parts.
# Input: A tuple and an integer ( k ).
# Output: A new tuple where the parts before and after the ( k )-th index are swapped.
# rotate_k: Create a new list with elements of the given list moved ( k ) positions towards the right. The elements at the end should come back to the beginning in a circular order.
# Input: A list and an integer ( k ) (default value ( k = 1 )).
# Output: A new list with the elements rotated ( k ) positions to the right.
# first_and_last_index: Get the indices of the first and last occurrence of a given item in a list. Assume the item is present in the list at least once.
# Input: A list and an item.
# Output: A tuple with the first and last indices of the given item in the list.
# reverse_first_and_last_halves: Reverse the first and last halves of a list with even length in place.
# Input: A list with an even length.
# Output: None (the list should be modified in place).

def swap_halves(items):
    mid = len(items) // 2
    return items[mid:] + items[:mid]

def swap_at_index(items, k):
    return items[k+1:] + items[:k+1]

def rotate_k(items, k=1):
    k = k % len(items)  # To handle cases where k is greater than the length of the list
    return items[-k:] + items[:-k]

def first_and_last_index(items, elem):
    first_index = items.index(elem)
    last_index = len(items) - 1 - items[::-1].index(elem)
    return (first_index, last_index)

def reverse_first_and_last_halves(items):
    mid = len(items) // 2
    items[:mid] = items[:mid][::-1]
    items[mid:] = items[mid:][::-1]