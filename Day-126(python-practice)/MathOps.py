# Q1 (Basic)

# Problem: Create a class MathOps with an instance method that doubles a number.


class MathOps:
    def double(self, x):   # instance method (needs self)
        return x * 2

obj = MathOps()
print(obj.double(5))


# Output:

# 10