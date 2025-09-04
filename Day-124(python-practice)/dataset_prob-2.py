# Problem 2: Frozen Car

@dataclass(frozen=True)
class Car:
    brand: str
    model: str
    year: int

c = Car("Tesla", "Model S", 2024)
# c.year = 2025  # ❌ Raises: dataclasses.FrozenInstanceError
