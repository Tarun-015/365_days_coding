import numpy as np

# ---------- BASIC SETUP ----------
arr = np.array([[1, 2, 3],
                [4, 5, 6]])

# ---------- MATHEMATICAL / STATISTICAL ----------
print(arr.sum())          # 21
print(arr.mean())         # 3.5
print(np.median(arr))     # 3.5
print(arr.std())          # 1.707
print(arr.var())          # 2.916
print(arr.min(), arr.max())     # 1 6
print(arr.argmax(), arr.argmin())  # 5 0
print(np.percentile(arr, 50))   # 3.5
print(np.average(arr, weights=[[1,1,1],[2,2,2]]))  # weighted mean

# ---------- AXIS OPERATIONS ----------
print(arr.sum(axis=0))    # col-wise → [5 7 9]
print(arr.sum(axis=1))    # row-wise → [6 15]

# ---------- SORTING / SEARCH ----------
a = np.array([5, 1, 4, 2, 3])
print(np.sort(a))         # [1 2 3 4 5]
print(np.argsort(a))      # [1 3 4 2 0]
print(np.where(a > 3))    # indices where cond true
print(np.extract(a > 3, a))  # [5 4]
print(np.unique([1,2,2,3]))  # [1 2 3]

# ---------- ELEMENT-WISE MATH ----------
x = np.array([0, np.pi/2, np.pi])
print(np.sin(x))          # [0. 1. 0.]
print(np.exp(x))          # [1. 4.81 23.14]
print(np.log(x + 1))      # avoid log(0)
print(np.sqrt([1,4,9]))   # [1. 2. 3.]

# ---------- COMPARISON / LOGICAL ----------
arr2 = np.array([1,2,3,4,5])
print(arr2 > 3)           # [F F F T T]
print(np.any(arr2 > 4))   # True
print(np.all(arr2 > 0))   # True
print(np.equal(arr2, [1,2,0,4,5]))  # [T T F T T]
print((arr2 > 2).sum())   # Count True → 3

# ---------- ARRAY MODIFICATION ----------
print(arr.reshape(3,2))   # reshape
print(arr.ravel())        # flatten (view)
print(arr.flatten())      # flatten (copy)
print(np.concatenate((arr, arr), axis=0))  # stack rows
print(np.hstack((arr, arr)))               # side by side
print(np.vstack((arr, arr)))               # vertical stack

# ---------- ROUNDING / FLOOR / CEIL ----------
nums = np.array([1.23, 4.56, -2.7])
print(np.round(nums, 1))  # [1.2 4.6 -2.7]
print(np.floor(nums))     # [ 1. 4. -3.]
print(np.ceil(nums))      # [ 2. 5. -2.]
print(np.trunc(nums))     # [ 1. 4. -2.]

# ---------- DOT PRODUCT ----------
A = np.array([[1,2],[3,4]])
B = np.array([[5,6],[7,8]])
print(np.dot(A,B))
# [[19 22]
#  [43 50]]

# ---------- CLIPPING / COUNT ----------
arr3 = np.array([1,5,10,15])
print(np.clip(arr3, 4, 12))   # [4,5,10,12]
print(np.count_nonzero(arr3)) # 4
