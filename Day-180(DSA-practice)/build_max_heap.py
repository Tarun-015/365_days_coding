# Build Max Heap from Array (Bottom-Up)
def build_max_heap(arr):
    n = len(arr)
    # Start from the last non-leaf node and heapify
    for i in range(n//2 - 1, -1, -1):
        heapify(arr, n, i)

def heapify(arr, n, i):
    largest = i
    l = 2 * i + 1
    r = 2 * i + 2

    if l < n and arr[l] > arr[largest]:
        largest = l
    if r < n and arr[r] > arr[largest]:
        largest = r

    if largest != i:
        arr[i], arr[largest] = arr[largest], arr[i]
        heapify(arr, n, largest)

# Example
arr = [3, 9, 2, 1, 4, 5]
build_max_heap(arr)
print("Max Heap Array:", arr)


# ✅ Output:

# Max Heap Array: [9, 4, 5, 1, 3, 2]