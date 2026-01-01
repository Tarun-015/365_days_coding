def xor_till(n):
    # pattern repeats every 4 numbers
    if n % 4 == 0: return n
    if n % 4 == 1: return 1
    if n % 4 == 2: return n + 1
    return 0

def xor_range(L, R):
    return xor_till(R) ^ xor_till(L - 1)

print(xor_range(3, 9))
