class Parent:
    def show_parent(self):
        print("This is Parent class")

class Child(Parent):
    def show_child(self):
        print("This is Child class")

c = Child()
c.show_parent()
c.show_child()


# Output:

# This is Parent class
# This is Child class