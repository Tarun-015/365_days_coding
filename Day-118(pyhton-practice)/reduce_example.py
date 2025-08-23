# reduce_example.py

from functools import reduce

# Find product of all numbers using reduce()
nums = [1, 2, 3, 4, 5]

product = reduce(lambda x, y: x * y, nums)
print("Numbers:", nums)
print("Product:", product)
