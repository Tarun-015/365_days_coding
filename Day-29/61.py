# Create a class named Calculator that has the following specification:

# Attributes

# (1) a: int, we shall call this the first attribute

# (2) b: int, we shall call this the second attribute

# Methods

# (1) __init__: accept two arguments a and b, assign them to the corresponding attributes
# (2) add: return the sum of the two attributes
# (3) multiply: return the product of the two attributes
# (4) subtract: subtract the second attribute from the first and return this value
# (5) quotient: return the quotient when the first attribute is divided by the second attribute
# (6) remainder: return the remainder when the first attribute is divided by the second

# (1) Each test case corresponds to one or more method calls. We will use C to denote the name of the object.

# (2) You do not have to accept input from the user or print output to the console. You just have to define the class based on the specifications given in the question.

class Calculator:
    def __init__(self, a, b):
        self.a, self.b = a, b
    def add(self):
        return self.a + self.b
    def multiply(self):
        return self.a * self.b
    def subtract(self):
        return self.a - self.b
    def quotient(self):
        return self.a // self.b
    def remainder(self):
        return self.a % self.b