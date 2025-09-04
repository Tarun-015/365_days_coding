# Problem 1: Slots Restriction

class Point:
    __slots__ = ('x', 'y')
    def __init__(self, x, y):
        self.x, self.y = x, y

p = Point(1, 2)
# p.z = 10  # Raises: AttributeError
