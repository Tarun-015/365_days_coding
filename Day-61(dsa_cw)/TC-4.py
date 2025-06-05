def fib(n):
    if n <= 1:
        return n
    return fib(n - 1) + fib(n - 2)

#  Solution:
# This makes 2 recursive calls at every step.

# So the recursion tree is exponential:
#     fib(n) = fib(n-1) + fib(n-2)

# Time Complexity: O(2ⁿ)