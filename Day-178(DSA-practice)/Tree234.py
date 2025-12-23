class Node234:
    def __init__(self):
        self.keys = []
        self.children = []
        self.leaf = True

class Tree234:
    def __init__(self):
        self.root = Node234()

    def split_child(self, parent, index):
        child = parent.children[index]
        new_child = Node234()
        mid_key = child.keys[1]

        # create new child
        new_child.keys = child.keys[2:]
        if not child.leaf:
            new_child.children = child.children[2:]
            child.children = child.children[:2]
        child.keys = child.keys[:1]

        # insert middle key to parent
        parent.keys.insert(index, mid_key)
        parent.children.insert(index + 1, new_child)

    def insert_non_full(self, node, key):
        if node.leaf:
            node.keys.append(key)
            node.keys.sort()
        else:
            i = len(node.keys) - 1
            while i >= 0 and key < node.keys[i]:
                i -= 1
            i += 1
            if len(node.children[i].keys) == 3:
                self.split_child(node, i)
                if key > node.keys[i]:
                    i += 1
            self.insert_non_full(node.children[i], key)

    def insert(self, key):
        root = self.root
        if len(root.keys) == 3:  # full node
            new_root = Node234()
            new_root.children.append(root)
            new_root.leaf = False
            self.split_child(new_root, 0)
            self.root = new_root
            self.insert_non_full(new_root, key)
        else:
            self.insert_non_full(root, key)

    def display(self, node=None, level=0):
        node = node or self.root
        print("Level", level, ":", node.keys)
        for child in node.children:
            self.display(child, level + 1)


# Example
tree = Tree234()
arr = [10, 20, 5, 6, 12, 30, 7, 17]
for x in arr:
    tree.insert(x)

print("\n2-3-4 Tree structure:")
tree.display()
