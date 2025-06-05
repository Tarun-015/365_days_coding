def nested_loop(n):
    count = 0
    for i in range(n):
        for j in range(i):
            count += 1

# Solution:
# For each i, inner loop runs j = 0 to i - 1.

# Total operations:
#     (0) + (1) + (2) + ... + (n - 1) = n(n - 1)/2

# Time Complexity: O(n²)