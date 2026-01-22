import numpy as np

arr = np.array([[1, 2, 3],
                [4, 5, 6]])

# --- BASIC ATTRIBUTES ---
arr.ndim        # → 2        → number of dimensions (axes)
arr.shape       # → (2, 3)   → rows × cols
arr.size        # → 6        → total elements (2*3)
arr.dtype       # → dtype('int64') → data type of elements
arr.itemsize    # → 8        → bytes per element (depends on dtype)
arr.nbytes      # → 48       → total memory = size * itemsize
arr.T           # → transpose
arr.flat        # → 1D iterator over all elements
arr.data        # → memory buffer address (rarely used)
