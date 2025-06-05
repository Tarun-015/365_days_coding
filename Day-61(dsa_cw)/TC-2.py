def binary_search(arr, target):
    low = 0
    high = len(arr) - 1
    while low <= high:
        mid = (low + high) // 2
        if arr[mid] == target:
            return mid
        elif arr[mid] < target:
            low = mid + 1
        else:
            high = mid - 1
    return -1

# Solution:
# Each iteration cuts the search space in half.

# First iteration: n elements

# Second: n/2

# Third: n/4

# ...

# This goes on until 1 element ⇒ takes log₂(n) steps.

# Time Complexity: O(log n)