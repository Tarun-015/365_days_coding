# All numbers appear twice except two unique ones — find both.

# Example:
# Input → [2, 4, 7, 9, 2, 4]
# Output → 7, 9

def two_non_repeating(nums):
    xor_all = 0
    for n in nums:
        xor_all ^= n
    rightmost_bit = xor_all & -xor_all      # isolate rightmost set bit
    a = b = 0
    for n in nums:
        if n & rightmost_bit:
            a ^= n
        else:
            b ^= n
    return a, b

print(two_non_repeating([2, 4, 7, 9, 2, 4]))
