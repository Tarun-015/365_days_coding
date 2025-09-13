class MyList:
    def __init__(self, data): self.data = data
    def __len__(self): return len(self.data)
    def __getitem__(self, i): return self.data[i]

ml = MyList([1, 2, 3])
print(len(ml))   # 3
print(ml[1])     # 2