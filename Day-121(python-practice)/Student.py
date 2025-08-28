# Example 1: Patching a Method in a Class

class Student:
    def greet(self):
        return "Hello, I am a student."

# Monkey patch greet()
def new_greet(self):
    return "Hi, I am Tarun!"

Student.greet = new_greet   # patching method

s = Student()
print(s.greet())   # Hi, I am Tarun!
