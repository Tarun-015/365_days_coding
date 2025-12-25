# Max Heap Insertion
def heap_insert(heap, val):
    heap.append(val)
    i = len(heap) - 1
    while i > 1 and heap[i//2] < heap[i]:
        heap[i], heap[i//2] = heap[i//2], heap[i]
        i //= 2

# Example
heap = [None]  # 1-based indexing
for v in [10, 20, 5, 30, 25]:
    heap_insert(heap, v)
print("Max Heap:", heap)


# Output:

# Max Heap: [None, 30, 25, 5, 10, 20]