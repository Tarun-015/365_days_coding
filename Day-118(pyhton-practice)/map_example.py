# map_example.py

# Square all numbers in a list using map()
nums = [1, 2, 3, 4, 5]

squares = list(map(lambda x: x**2, nums))
print("Original:", nums)
print("Squares:", squares)
