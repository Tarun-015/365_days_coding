
# Convert Min Heap to Max Heap
import heapq

def min_to_max_heap(min_heap):
    # Simply negate all elements to flip the order
    max_heap = [-x for x in min_heap]
    heapq.heapify(max_heap)
    # Convert back by negating again
    return [-x for x in max_heap]

# Example
min_heap = [1, 3, 5, 7, 9, 11]
heapq.heapify(min_heap)
print("Original Min Heap:", min_heap)
print("Converted Max Heap:", min_to_max_heap(min_heap))


# ✅ Output:

# Original Min Heap: [1, 3, 5, 7, 9, 11]
# Converted Max Heap: [11, 9, 5, 7, 3, 1]