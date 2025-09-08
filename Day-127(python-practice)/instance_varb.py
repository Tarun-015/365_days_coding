# 1. Instance Variables

# Belong to object (instance).

# Har object ka apna copy hota hai.

# Defined inside __init__ using self.

class Student:
    def __init__(self, name, age):
        self.name = name       # instance variable
        self.age = age

s1 = Student("Tarun", 20)
s2 = Student("Aman", 22)

print(s1.name, s2.name)   # Tarun Aman