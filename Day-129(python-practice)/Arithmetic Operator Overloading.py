class Vector:
    def __init__(self, x, y): self.x, self.y = x, y
    def __add__(self, other): return Vector(self.x+other.x, self.y+other.y)
    def __repr__(self): return f"Vector({self.x}, {self.y})"

v1 = Vector(2, 3)
v2 = Vector(4, 5)
print(v1 + v2)  # Vector(6, 8)
