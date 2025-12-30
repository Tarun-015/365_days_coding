# Given an array containing n distinct numbers from 0 to n, find the missing one.

# Example:
# Input → [3, 0, 1]
# Output → 2

def missing_number(nums):
    res = 0
    for i in range(len(nums)):
        res ^= i ^ nums[i]
    res ^= len(nums)
    return res

print(missing_number([3, 0, 1]))
