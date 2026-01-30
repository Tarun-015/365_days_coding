import numpy as np

arr = np.array([[1, 2, 3],
                [4, 5, 6]])

# ---------- BASIC ITERATION ----------
for x in np.array([10,20,30]):
    print(x)                    # 10 20 30

# ---------- ROW-WISE (2D) ----------
for row in arr:
    print(row)                  # [1 2 3], [4 5 6]

# ---------- COLUMN-WISE ----------
for col in arr.T:
    print(col)                  # [1 4], [2 5], [3 6]

# ---------- ALL ELEMENTS ----------
for x in np.nditer(arr):
    print(x, end=' ')           # 1 2 3 4 5 6

# ---------- MODIFY ELEMENTS ----------
arr2 = np.array([1, 2, 3, 4])
for x in np.nditer(arr2, op_flags=['readwrite']):
    x[...] = x * 2              # modify in place
print(arr2)                     # [2 4 6 8]

# ---------- ITERATE WITH INDICES ----------
for idx, val in np.ndenumerate(arr):
    print(idx, val)
# (0,0) 1  (0,1) 2  (0,2) 3  (1,0) 4 ...

# ---------- COLUMN-MAJOR ORDER ----------
for x in np.nditer(arr, order='F'):
    print(x, end=' ')           # 1 4 2 5 3 6
