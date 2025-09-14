# Q2 (Intermediate)

# Problem: Create an abstract class Vehicle with method fuel_type(). Implement it in Car and Bike classes.

# Solution:

from abc import ABC, abstractmethod

class Vehicle(ABC):
    @abstractmethod
    def fuel_type(self):
        pass

class Car(Vehicle):
    def fuel_type(self):
        return "Petrol or Diesel"

class Bike(Vehicle):
    def fuel_type(self):
        return "Petrol"

c = Car()
b = Bike()
print("Car fuel:", c.fuel_type())
print("Bike fuel:", b.fuel_type())


# Output:

# Car fuel: Petrol or Diesel
# Bike fuel: Petrol