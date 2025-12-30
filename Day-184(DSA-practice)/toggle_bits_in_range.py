# Flip all bits from position l to r (1-based).

# Example:
# Input → n = 17 (10001), l = 2, r = 4
# Output → 26 (11010)

def toggle_bits_in_range(n, l, r):
    mask = ((1 << r) - 1) ^ ((1 << (l - 1)) - 1)
    return n ^ mask

print(toggle_bits_in_range(17, 2, 4))
