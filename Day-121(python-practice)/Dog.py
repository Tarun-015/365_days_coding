# Example 4: Instance-level Monkey Patching

class Dog:
    def sound(self):
        return "Woof!"

dog1 = Dog()
dog2 = Dog()

# Patch only dog1
dog1.sound = lambda: "Meow!"

print(dog1.sound())  # Meow!
print(dog2.sound())  # Woof!
