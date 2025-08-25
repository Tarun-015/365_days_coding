Descriptor Definition in Python

A descriptor is any class that defines one or more of the special methods:

__get__(self, instance, owner) → Called when you access the attribute.

__set__(self, instance, value) → Called when you assign a value.

__delete__(self, instance) → Called when you delete the attribute.

👉 If a class defines any of these methods, its instances are descriptors.

[n short: Descriptors are the mechanism behind @property, dataclasses, and ORMs like Django models.]



hese 4 questions cover:

  Validation

  Read-only attributes

  Logging/Debugging

  Per-instance storage (advanced gotcha in descriptors)
