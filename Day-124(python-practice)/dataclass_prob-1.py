# 9. Dataclasses
# Problem 1: Book

from dataclasses import dataclass

@dataclass
class Book:
    title: str
    author: str
    price: float

print(Book("Python", "Guido", 500))


# Output:

# Book(title='Python', author='Guido', price=500)