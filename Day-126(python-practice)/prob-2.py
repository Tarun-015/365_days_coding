# Q2 (Intermediate)

# Problem: Create a class MathOps with a static method that adds two numbers without using self.



class MathOps:
    @staticmethod
    def add(a, b):   # static method (no self)
        return a + b

print(MathOps.add(5, 3))   # called via class
obj = MathOps()
print(obj.add(2, 4))       # also works via instance


# Output:

# 8
# 6