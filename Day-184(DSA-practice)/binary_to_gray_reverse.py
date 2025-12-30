# Convert a binary number to its Gray code equivalent and reverse it back.

# Example:
# Input → n = 7 (111)
# Gray Code → 100

def binary_to_gray(n):
    return n ^ (n >> 1)

def gray_to_binary(g):
    res = g
    while g:
        g >>= 1
        res ^= g
    return res

n = 7
g = binary_to_gray(n)
print("Gray Code:", bin(g)[2:])
print("Back to Binary:", gray_to_binary(g))
