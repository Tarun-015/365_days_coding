# Q2. Decorators

# Write a decorator time_it that measures and prints the execution time of any function it decorates.
# 👉 Use it on a function that calculates factorial recursively.

import time

# Decorator to measure execution time
def time_it(func):
    def wrapper(*args, **kwargs):
        start = time.time()
        result = func(*args, **kwargs)
        end = time.time()
        print(f"Execution time: {end - start:.6f} seconds")
        return result
    return wrapper

@time_it
def factorial(n):
    return 1 if n == 0 else n * factorial(n - 1) if n > 1 else 1

print("Factorial:", factorial(10))
