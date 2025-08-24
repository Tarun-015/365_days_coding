# Q1. Generators & Iterators

# Write a Python generator function fibonacci(n) that yields the first n Fibonacci numbers.
# # 👉 Bonus: Use it in a for-loop without converting to a list.

# Fibonacci Generator
def fibonacci(n):
    a, b = 0, 1
    for _ in range(n):
        yield a   # generator remembers state
        a, b = b, a + b

# Usage
for num in fibonacci(10):
    print(num, end=" ")
