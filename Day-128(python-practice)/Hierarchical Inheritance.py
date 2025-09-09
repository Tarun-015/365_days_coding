class Parent:
    def feature(self):
        print("Parent feature")

class Child1(Parent):
    def c1(self): print("Child1 feature")

class Child2(Parent):
    def c2(self): print("Child2 feature")

c1 = Child1()
c2 = Child2()

c1.feature()
c2.feature()

# Output:

# Parent feature
# Parent feature
