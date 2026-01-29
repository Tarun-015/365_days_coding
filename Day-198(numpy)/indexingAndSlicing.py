import numpy as np

# ---------- BASIC ARRAY ----------
arr = np.array([[10, 20, 30],
                [40, 50, 60],
                [70, 80, 90]])

# ---------- 1️⃣ BASIC INDEXING ----------
print(arr[0, 1])       # 20 (row 0, col 1)
print(arr[-1, -2])     # 80 (last row, 2nd last col)
print(arr[2][0])       # 70 (same as arr[2,0])

# ---------- 2️⃣ SLICING ----------
a = np.array([10, 20, 30, 40, 50])
print(a[1:4])          # [20,30,40]
print(a[:3])           # [10,20,30]
print(a[::2])          # [10,30,50]
print(a[::-1])         # [50,40,30,20,10] → reverse

# 2D slicing
print(arr[:2, 1:])     # first 2 rows, columns 1→end
# [[20,30],
#  [50,60]]

print(arr[:, 0])       # all rows, first col → [10,40,70]

# ---------- 3️⃣ FANCY INDEXING ----------
b = np.array([10, 20, 30, 40, 50])
print(b[[0, 2, 4]])    # [10,30,50]
print(arr[[0,2], [1,2]])  # elements (0,1) & (2,2) → [20,90]

# ---------- 4️⃣ BOOLEAN INDEXING ----------
nums = np.array([10, 25, 30, 45, 50])
mask = nums > 30
print(mask)            # [F F F T T]
print(nums[mask])      # [45 50]

# Combined conditions → use &, |, ~
print(nums[(nums > 20) & (nums < 50)])  # [25,30,45]
print(nums[(nums < 25) | (nums > 45)])  # [10,50]
print(nums[~(nums > 30)])               # [10,25,30]

# ---------- 5️⃣ VIEW vs COPY ----------
a = np.array([1,2,3,4])
b = a[:2]              # slice → view
b[0] = 99
print(a)               # [99,2,3,4] (change reflected)

c = a[[0,2]]           # fancy indexing → copy
c[0] = 500
print(a)               # [99,2,3,4] (no change)

# ---------- 6️⃣ MULTI-D FILTER ----------
m = np.array([[ 5,10,15],
              [20,25,30],
              [35,40,45]])

print(m[m > 20])
# [25,30,35,40,45]
