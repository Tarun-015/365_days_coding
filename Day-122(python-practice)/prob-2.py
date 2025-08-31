# Q2 (Intermediate)

# Problem: Write a generator function that yields Fibonacci numbers up to N terms.


def fibonacci(n):
    a, b = 0, 1
    for _ in range(n):
        yield a
        a, b = b, a + b

print(list(fibonacci(7)))

# Output:

# [0, 1, 1, 2, 3, 5, 8]