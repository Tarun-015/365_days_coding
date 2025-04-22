# Find percentage increased
# Write a function to calculate the percentage increase from the original value to the new value.

# Assume original is less than or equal to new.

# Examples

# >>> percentage_increased(50, 75)
# 50.0
# >>> percentage_increased(80, 100)
# 25.0

def percentage_increased(old_value, new_value):
    return ((new_value - old_value) / old_value) * 100

