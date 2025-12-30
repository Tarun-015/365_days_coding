# Count total number of 1 bits in all numbers from 1 to n.

# Example:
# Input → n = 4 (1,2,3,4)
# Binary → 1,10,11,100 → total 5 ones.

def count_set_bits(n):
    if n == 0:
        return 0
    x = n.bit_length() - 1
    return (x * (1 << (x - 1))) + (n - (1 << x) + 1) + count_set_bits(n - (1 << x))

print(count_set_bits(4))
