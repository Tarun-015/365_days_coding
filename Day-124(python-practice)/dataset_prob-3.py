# Problem 3: Nested Student + Courses

@dataclass
class Course:
    name: str
    credits: int

@dataclass
class Student:
    name: str
    roll: int
    courses: list

    def total_credits(self):
        return sum(c.credits for c in self.courses)

s = Student("Tarun", 101, [Course("Math", 4), Course("ML", 3)])
print(f"{s.name} has {s.total_credits()} credits")


# Output:

# Tarun has 7 credits