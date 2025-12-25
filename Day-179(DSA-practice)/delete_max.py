# Delete (Extract Max)
def delete_max(heap):
    if len(heap) <= 1:
        return None
    if len(heap) == 2:
        return heap.pop()

    max_val = heap[1]
    heap[1] = heap.pop()  # move last to root

    i = 1
    while 2 * i < len(heap):
        left = 2 * i
        right = 2 * i + 1
        larger = left

        if right < len(heap) and heap[right] > heap[left]:
            larger = right

        if heap[i] < heap[larger]:
            heap[i], heap[larger] = heap[larger], heap[i]
            i = larger
        else:
            break

    return max_val

# Example
print("Deleted:", delete_max(heap))
print("Heap after deletion:", heap)