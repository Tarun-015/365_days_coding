#What is the time complexity of the following code?

def example_function(arr):
    n = len(arr)
    for i in range(n):
        for j in range(i, n):
            print(arr[i], arr[j])

# Solution:
# Step 1: Understand what the code does
# The function prints all pairs (i, j) where i <= j.
# So it’s basically printing the upper triangle of a matrix.

# Step 2: Count the number of operations
# Let’s look at how many times the print statement runs:

# When i = 0: j goes from 0 to n-1 → n times

# When i = 1: j goes from 1 to n-1 → n - 1 times

# When i = 2: j goes from 2 to n-1 → n - 2 times

# ...

# When i = n-1: j goes from n-1 to n-1 → 1 time

# So total number of times print runs:
#     n + (n - 1) + (n - 2) + ... + 1 = n(n + 1)/2

# Step 3: Drop constants and lower-order terms
# We get O(n²) time complexity.