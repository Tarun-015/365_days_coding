# The Collatz function is defined for a positive integer 
# n
# n as follows.

# f
# (
# n
# )
# =
# {
# 3
# n
# +
# 1
# if 
# n
#  is odd
# n
# 2
# if 
# n
#  is even
# f(n)= 
# ⎩
# ⎨
# ⎧
# ​
  
# 3n+1
# 2
# n
# ​
 
# ​
  
# if n is odd
# if n is even
# ​
 
# We consider the repeated application of the Collatz function starting with a given integer 
# n
# n, which results in the following sequence:

# f
# (
# n
# )
# ,
# f
# (
# f
# (
# n
# )
# )
# ,
# f
# (
# f
# (
# f
# (
# n
# )
# )
# )
# ,
# …
# f(n),f(f(n)),f(f(f(n))),…
# It is conjectured that no matter which positive integer 
# n
# n you start from, the sequence will always reach 
# 1
# 1. For example, if 
# n
# =
# 10
# n=10, the sequence is:

# Seq No.	n	f(n)
# 1	10	5
# 2	5	16
# 3	16	8
# 4	8	4
# 5	4	2
# 6	2	1
# Thus, if you start from 
# n
# =
# 10
# n=10, you need to apply the function 
# f
# f six times in order to first reach 1.

# Write a recursive function named collatz that accepts a positive integer 
# n
# n as argument, where 
# 1
# <
# n
# ≤
# 32
# ,
# 000
# 1<n≤32,000, and returns the number of times 
# f
# f has to be applied repeatedly in order to first reach 1.

# You do not have to accept input from the user or print output to the console. You just have to write the function definition.

def collatz(n):
    # base case of the recursion
    # if n = 1, you don't need to call the function at all
    if n == 1:
        return 0
    # simple application of the piecewise defn of the
    # Collatz function
    if n % 2 == 0:
        return 1 + collatz(n // 2)
    else:
        return 1 + collatz(3 * n + 1)