# Find k Largest Elements using Heap
import heapq

def k_largest(nums, k):
    return heapq.nlargest(k, nums)

arr = [12, 3, 5, 7, 19, 0, 4]
k = 3
print(f"{k} largest elements:", k_largest(arr, k))


# ✅ Output:

# 3 largest elements: [19, 12, 7]