# Q1 (Basic)

# Problem: Create a custom iterator that counts from 1 to N.

class Counter:
    def __init__(self, n):
        self.n = n
        self.current = 0

    def __iter__(self):
        return self

    def __next__(self):
        self.current += 1
        if self.current > self.n:
            raise StopIteration
        return self.current

for num in Counter(5):
    print(num, end=" ")


# Output:

# 1 2 3 4 5