# Q1. Simple Data Validation with Descriptor

# Implement a descriptor class PositiveNumber that only allows positive integers as attribute values.

class Account:
    balance = PositiveNumber()

a = Account()
a.balance = 100     # works
a.balance = -50     # raises ValueError
