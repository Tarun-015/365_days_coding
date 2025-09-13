class Adder:
    def __init__(self, n): self.n = n
    def __call__(self, x): return self.n + x

add5 = Adder(5)
print(add5(10))  # 15