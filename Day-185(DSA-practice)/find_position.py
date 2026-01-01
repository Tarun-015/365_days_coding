# If a number has exactly one set bit (power of 2), find its position (1-based).

# Example:
# Input → n = 16 (10000)
# Output → 5

def find_position(n):
    if n == 0 or (n & (n - 1)) != 0:
        return -1   # invalid
    pos = 1
    while n > 1:
        n >>= 1
        pos += 1
    return pos

print(find_position(16))
