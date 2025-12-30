# Given n and k, turn off the kth bit (1-based from right).

# Example:
# Input → n = 29 (11101), k = 3
# Output → 25 (11001)

def turn_off_kth_bit(n, k):
    return n & ~(1 << (k - 1))

print(turn_off_kth_bit(29, 3))
