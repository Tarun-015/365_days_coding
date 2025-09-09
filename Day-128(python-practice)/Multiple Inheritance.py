class Father:
    def skills(self):
        print("Father: Business skills")

class Mother:
    def skills(self):
        print("Mother: Cooking skills")

class Child(Father, Mother):
    def skills(self):
        print("Child: Coding +", end=" ")
        super().skills()  # Follows MRO

c = Child()
c.skills()

# Output (MRO):

# Child: Coding + Business skills