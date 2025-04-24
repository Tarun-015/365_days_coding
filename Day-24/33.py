# Element present in exactly one of the two lists
# Given two lists, return a list containing the items that are present in either list but not in both.

# Example

# >>> in_exactly_one([1, 2, 3], [3, 4, 5])
# {1, 2, 4, 5}

def in_exactly_one(list1, list2):
    return set(list1) ^ set(list2)

