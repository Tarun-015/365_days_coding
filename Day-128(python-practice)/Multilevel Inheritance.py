class Grandparent:
    def feature1(self):
        print("Grandparent feature")

class Parent(Grandparent):
    def feature2(self):
        print("Parent feature")

class Child(Parent):
    def feature3(self):
        print("Child feature")

c = Child()
c.feature1()
c.feature2()
c.feature3()

# Output:

# Grandparent feature
# Parent feature
# Child feature