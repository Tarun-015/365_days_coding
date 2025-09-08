# 2. Class Variables (Static Variables)

# Belong to the class, shared by all objects.

# Defined outside methods, inside class.

class Student:
    school = "IIT Madras"   # class variable

    def __init__(self, name):
        self.name = name

s1 = Student("Tarun")
s2 = Student("Aman")

print(s1.school)   # IIT Madras
print(s2.school)   # IIT Madras