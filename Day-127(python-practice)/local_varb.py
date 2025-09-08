# 3. Local Variables

# Defined inside a method (function scope).

# Exist only while method is executing.

class Student:
    def __init__(self, name):
        self.name = name
    
    def greet(self):
        msg = f"Hello, {self.name}"  # local variable
        return msg

s = Student("Tarun")
print(s.greet())  # Hello, Tarun
# print(msg) ❌ NameError (local variable not accessible outside)