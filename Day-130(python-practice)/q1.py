# Q1 (Basic)

# Problem: Create an abstract class Shape with an abstract method area(). Implement it in Circle class.

# Solution:

from abc import ABC, abstractmethod
import math

class Shape(ABC):
    @abstractmethod
    def area(self):
        pass

class Circle(Shape):
    def __init__(self, radius):
        self.radius = radius

    def area(self):
        return math.pi * self.radius ** 2

c = Circle(5)
print("Circle area:", c.area())


# Output:

# Circle area: 78.53981633974483