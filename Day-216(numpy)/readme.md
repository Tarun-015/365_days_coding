The broadcasting rules
NumPy compares array shapes from right to left.
Two dimensions are compatible if:
- They are equal.
- One of them is 1.
- One dimension is missing; it is treated as 1.
