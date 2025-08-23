# filter_example.py

# Keep only even numbers using filter()
nums = [1, 2, 3, 4, 5, 6]

evens = list(filter(lambda x: x % 2 == 0, nums))
print("Original:", nums)
print("Evens:", evens)
