import heapq

def kth_smallest(arr, k):
    heapq.heapify(arr)      # convert to min heap
    smallest = None
    for i in range(k):      # extract min k times
        smallest = heapq.heappop(arr)
    return smallest

# Example
arr = [7, 10, 4, 3, 20, 15]
k = 3
print(f"{k}rd smallest element:", kth_smallest(arr.copy(), k))
