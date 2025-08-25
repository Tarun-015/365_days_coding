# Q4. Descriptor with Multiple Instances

# Make a descriptor Grade that stores grades per instance (not shared across all objects).

class Student:
    math = Grade()
    physics = Grade()

s1 = Student()
s2 = Student()

s1.math = 90
s2.math = 75
print(s1.math, s2.math)   # 90 75
