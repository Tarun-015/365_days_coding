import numpy as np

# --- RANDOM ARRAYS ---

#  Uniform random values [0,1)
a = np.random.rand(2, 3)
# [[0.23, 0.88, 0.12],
#  [0.45, 0.67, 0.91]]

#  Normal distribution (mean=0, std=1)
b = np.random.randn(3, 2)
# [[ 0.56, -1.23],
#  [ 0.98,  0.12],
#  [-0.43,  0.88]]

#  Random integers in range
c = np.random.randint(10, 50, (2, 3))
# [[35, 22, 48],
#  [11, 19, 41]]

#  Fixing random results (reproducibility)
np.random.seed(42)
d = np.random.rand(3)
# → Same output every run: [0.3745, 0.9507, 0.7319]

# --- RESHAPING ARRAYS ---

arr = np.arange(12)
# [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]

#  Basic reshape
reshaped = arr.reshape(3, 4)
# [[0,1,2,3],
#  [4,5,6,7],
#  [8,9,10,11]]

#  Auto dimension (-1)
auto = arr.reshape(2, -1)
# (2,6) → NumPy infers remaining dimension

#  Flatten (copy) vs Ravel (view)
flat = arr.flatten()   # copy
rav = arr.ravel()      # view (memory efficient)

#  Check if reshaped is view or copy
reshaped.base is arr   # True → same data (view)