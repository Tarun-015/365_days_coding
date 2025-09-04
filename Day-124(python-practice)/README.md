__slots__ is a way to tell Python exactly which attributes a class can have. This saves memory and prevents adding extra attributes by mistake.

A dataclass is a special Python class that automatically generates common methods like constructor (__init__), string representation (__repr__), and equality checks (__eq__). It is mainly used for storing structured data in a clean and simple way.
