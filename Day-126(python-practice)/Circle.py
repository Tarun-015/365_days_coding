Q3 (Advanced)

# Problem: Make a class Circle with:

# Instance method: area() → calculate area using self.radius

# Static method: pi() → return value of π

# Solution:

class Circle:
    def __init__(self, radius):
        self.radius = radius

    def area(self):  # instance method
        return self.pi() * (self.radius ** 2)

    @staticmethod
    def pi():
        return 3.14159

c = Circle(5)
print("Area:", c.area())
print("Pi:", Circle.pi())


# Output:

# Area: 78.53975
# Pi: 3.14159