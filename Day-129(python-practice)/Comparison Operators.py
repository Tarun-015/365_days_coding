class Box:
    def __init__(self, volume): self.volume = volume
    def __lt__(self, other): return self.volume < other.volume

print(Box(10) < Box(20))  # True