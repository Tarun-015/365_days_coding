# Swap positions of all odd & even bits in a 32-bit integer.

# Example:
# Input → n = 23 (00010111)
# # Output → 43 (00101011)

def swap_odd_even_bits(n):
    even_mask = 0xAAAAAAAA  # 1010...
    odd_mask  = 0x55555555  # 0101...
    even_bits = (n & even_mask) >> 1
    odd_bits  = (n & odd_mask) << 1
    return even_bits | odd_bits

print(swap_odd_even_bits(23))
