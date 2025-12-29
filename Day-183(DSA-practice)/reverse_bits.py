def reverse_bits(n):
    rev = 0
    for i in range(32):
        rev = (rev << 1) | (n & 1)
        n >>= 1
    return rev

print(reverse_bits(6))
