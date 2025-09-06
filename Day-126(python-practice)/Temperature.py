# Q4 (Hero)

# Problem: Create a Temperature class with:

# Instance method → to_fahrenheit() (convert self.celsius to Fahrenheit)

# Static method → c_to_f(c) (convert any Celsius value to Fahrenheit without object)


class Temperature:
    def __init__(self, celsius):
        self.celsius = celsius

    def to_fahrenheit(self):  # instance method
        return (self.celsius * 9/5) + 32

    @staticmethod
    def c_to_f(c):  # static method
        return (c * 9/5) + 32

t = Temperature(25)
print("Instance Method:", t.to_fahrenheit())  # using object
print("Static Method:", Temperature.c_to_f(25))  # without object


# Output:

# Instance Method: 77.0
# Static Method: 77.0