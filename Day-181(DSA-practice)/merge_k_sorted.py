import heapq

def merge_k_sorted(arrays):
    heap = []
    result = []

    # Push first element of each array with (value, array_index, element_index)
    for i, arr in enumerate(arrays):
        if arr:
            heapq.heappush(heap, (arr[0], i, 0))

    while heap:
        val, arr_idx, elem_idx = heapq.heappop(heap)
        result.append(val)

        # If there are more elements in the same array
        if elem_idx + 1 < len(arrays[arr_idx]):
            next_val = arrays[arr_idx][elem_idx + 1]
            heapq.heappush(heap, (next_val, arr_idx, elem_idx + 1))

    return result

# Example
arrays = [
    [1, 4, 5],
    [1, 3, 4],
    [2, 6]
]
print("Merged Sorted Array:", merge_k_sorted(arrays))
