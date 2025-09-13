Definition

Magical methods are special methods in Python that start and end with double underscores (e.g., __init__, __str__).

They allow you to define how objects of your class behave with built-in functions and operators.

Categories ::

    Object Construction & Representation

__init__ → constructor (called when object is created).

__del__ → destructor (cleanup before object is destroyed).

__str__ → user-friendly string (for print).

__repr__ → developer-friendly string (for debugging).

    Arithmetic Operators

__add__, __sub__, __mul__, __truediv__, etc. → allow operator overloading.

    Comparison Operators

__eq__, __lt__, __gt__, etc. → define how objects are compared.

    Attribute Access

__getattr__, __setattr__, __delattr__, __getattribute__ → control attribute lookup and assignment.

    Container Behavior

__len__, __getitem__, __setitem__, __iter__, __next__ → make objects behave like lists/dicts.

    Callable Objects

__call__ → lets objects act like functions.

    Context Managers

__enter__, __exit__ → used with with statement.
