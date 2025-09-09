class A:
    def showA(self): print("Class A")

class B(A):
    def showB(self): print("Class B")

class C(A):
    def showC(self): print("Class C")

class D(B, C):   # Hybrid = Multiple + Hierarchical
    def showD(self): print("Class D")

d = D()
d.showA()
d.showB()
d.showC()
d.showD()

# Output:

# Class A
# Class B
# Class C
# Class D
