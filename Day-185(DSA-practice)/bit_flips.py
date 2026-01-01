# Minimum Bit Flips to Convert A → B

# Example:
# A = 10 (1010)
# B = 20 (10100)
# # Output → 2 (two bits differ)

def bit_flips(a, b):
    x = a ^ b
    count = 0
    while x:
        x &= (x - 1)
        count += 1
    return count

print(bit_flips(10, 20))
