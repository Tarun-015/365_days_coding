class Demo:
    def __getattr__(self, name):
        return f"{name} not found"

d = Demo()
print(d.something)  # something not found