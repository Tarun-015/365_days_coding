# Heap Implementation Class (Reusable)
class MaxHeap:
    def __init__(self):
        self.heap = [None]

    def insert(self, val):
        self.heap.append(val)
        i = len(self.heap) - 1
        while i > 1 and self.heap[i // 2] < self.heap[i]:
            self.heap[i], self.heap[i // 2] = self.heap[i // 2], self.heap[i]
            i //= 2

    def extract_max(self):
        if len(self.heap) <= 1:
            return None
        if len(self.heap) == 2:
            return self.heap.pop()
        root = self.heap[1]
        self.heap[1] = self.heap.pop()
        self._heapify(1)
        return root

    def _heapify(self, i):
        left = 2 * i
        right = 2 * i + 1
        largest = i
        if left < len(self.heap) and self.heap[left] > self.heap[largest]:
            largest = left
        if right < len(self.heap) and self.heap[right] > self.heap[largest]:
            largest = right
        if largest != i:
            self.heap[i], self.heap[largest] = self.heap[largest], self.heap[i]
            self._heapify(largest)

    def display(self):
        print("Heap Array:", self.heap[1:])

# Example
H = MaxHeap()
for val in [15, 10, 30, 20, 8, 25]:
    H.insert(val)
H.display()
print("Extracted Max:", H.extract_max())
H.display()


# ✅ Output:

# Heap Array: [30, 20, 25, 10, 8, 15]
# Extracted Max: 30
# Heap Array: [25, 20, 15, 10, 8]
