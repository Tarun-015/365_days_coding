import numpy as np

# ---------- RESHAPING ----------
arr = np.arange(12)
print(arr.reshape(3, 4))        # (3x4)
print(arr.reshape(2, -1))       # auto infer (2x6)
print(arr.flatten())            # 1D copy
print(arr.ravel())              # 1D view (faster)

# ---------- STACKING ----------
a = np.array([[1, 2], [3, 4]])
b = np.array([[5, 6]])
print(np.vstack((a, b)))        # vertical → [[1 2],[3 4],[5 6]]

x = np.array([[1, 2], [3, 4]])
y = np.array([[5], [6]])
print(np.hstack((x, y)))        # horizontal → [[1 2 5],[3 4 6]]

# Depth stacking (3D)
p = np.array([[1, 2], [3, 4]])
q = np.array([[5, 6], [7, 8]])
print(np.dstack((p, q)))
# [[[1 5],[2 6]],[[3 7],[4 8]]]

# Concatenate general form
print(np.concatenate((a, a), axis=0))  # vertical
print(np.concatenate((a, a), axis=1))  # horizontal

# ---------- SPLITTING ----------
arr2 = np.array([10,20,30,40,50,60])
print(np.split(arr2, 3))        # equal parts
print(np.array_split(arr2, 4))  # uneven allowed

# 2D split
m = np.array([[1,2,3,4],[5,6,7,8]])
print(np.hsplit(m, 2))          # split by columns
print(np.vsplit(m, 2))          # split by rows
