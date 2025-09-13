class Person:
    def __init__(self, name): self.name = name
    def __str__(self): return f"Person: {self.name}"
    def __repr__(self): return f"Person(name={self.name!r})"

p = Person("Tarun")
print(str(p))   # Person: Tarun
print(repr(p))  # Person(name='Tarun')
