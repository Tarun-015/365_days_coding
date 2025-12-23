class BPlusTree:
    def __init__(self, order=3):
        self.order = order
        self.root = []

    def insert(self, key):
        self.root.append(key)
        self.root.sort()
        # Split if full
        if len(self.root) > self.order:
            mid = len(self.root) // 2
            left = self.root[:mid]
            right = self.root[mid:]
            self.root = [left, right]  # simple 2-level split

    def display(self):
        print("B+ Tree structure:", self.root)



bptree = BPlusTree(order=3)
arr = [10, 20, 5, 6, 12, 30, 7, 17]
for a in arr:
    bptree.insert(a)

bptree.display()
