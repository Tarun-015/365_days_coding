class BTreeNode:
    def __init__(self, t, leaf=False):
        self.t = t
        self.keys = []
        self.children = []
        self.leaf = leaf

class BTree:
    def __init__(self, t):
        self.root = BTreeNode(t, True)
        self.t = t  # order (minimum degree)

    def insert(self, k):
        root = self.root
        if len(root.keys) == (2 * self.t - 1):
            s = BTreeNode(self.t, False)
            s.children.insert(0, root)
            self.split_child(s, 0)
            i = 0
            if s.keys[0] < k:
                i += 1
            self.insert_non_full(s.children[i], k)
            self.root = s
        else:
            self.insert_non_full(root, k)

    def split_child(self, x, i):
        t = self.t
        y = x.children[i]
        z = BTreeNode(t, y.leaf)
        x.children.insert(i + 1, z)
        x.keys.insert(i, y.keys[t - 1])
        z.keys = y.keys[t:(2 * t - 1)]
        y.keys = y.keys[0:t - 1]
        if not y.leaf:
            z.children = y.children[t:(2 * t)]
            y.children = y.children[0:t]

    def insert_non_full(self, x, k):
        i = len(x.keys) - 1
        if x.leaf:
            x.keys.append(None)
            while i >= 0 and k < x.keys[i]:
                x.keys[i + 1] = x.keys[i]
                i -= 1
            x.keys[i + 1] = k
        else:
            while i >= 0 and k < x.keys[i]:
                i -= 1
            i += 1
            if len(x.children[i].keys) == (2 * self.t - 1):
                self.split_child(x, i)
                if k > x.keys[i]:
                    i += 1
            self.insert_non_full(x.children[i], k)

    def display(self, node=None, level=0):
        node = node or self.root
        print("Level", level, ":", node.keys)
        for child in node.children:
            self.display(child, level + 1)



btree = BTree(2)  # minimum degree t=2
arr = [10, 20, 5, 6, 12, 30, 7, 17]
for a in arr:
    btree.insert(a)

print("\nB-Tree structure:")
btree.display()
