# Min Heap using heapq (built-in)
import heapq

arr = [10, 5, 30, 20, 15]
heapq.heapify(arr)  # convert list into min heap
print("Min Heap:", arr)

heapq.heappush(arr, 3)
print("After Push:", arr)

print("Pop Min:", heapq.heappop(arr))
print("Heap Now:", arr)


# Output:

# Min Heap: [5, 10, 30, 20, 15]
# After Push: [3, 5, 30, 20, 15, 10]
# Pop Min: 3
# Heap Now: [5, 10, 30, 20, 15]