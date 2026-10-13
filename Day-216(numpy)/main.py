import numpy as np

# 1. Scalar broadcasting
a = np.array([1, 2, 3])
print(a + 10)
# [11 12 13]

# 2. 1D array broadcasting
a = np.array([1, 2, 3])
b = np.array([10, 20, 30])
print(a + b)
# [11 22 33]

# 3. Row broadcasting
a = np.array([[1, 2, 3],
              [4, 5, 6]])
b = np.array([10, 20, 30])
print(a + b)
# [[11 22 33]
#  [14 25 36]]

# 4. Column broadcasting
a = np.array([[1, 2, 3],
              [4, 5, 6]])
b = np.array([[10],
              [20]])
print(a + b)
# [[11 12 13]
#  [24 25 26]]

# 5. Multiplication broadcasting
a = np.array([[1, 2, 3],
              [4, 5, 6]])
b = np.array([2, 3, 4])
print(a * b)
# [[ 2  6 12]
#  [ 8 15 24]]

# 6. Broadcasting with different dimensions
a = np.ones((3, 4))
b = np.array([[1], [2], [3]])
print((a + b).shape)
# (3, 4)

# 7. Incompatible shapes (raises ValueError)
a = np.array([1, 2, 3, 4])
b = np.array([10, 20])
# print(a + b)  # ValueError

# 8. Broadcasting rules demonstration
x = np.ones((3, 4))
y = np.ones((4,))
z = x + y
print(z.shape)
# (3, 4)

# 9. Explicit broadcasting
a = np.array([1, 2, 3])
print(np.broadcast_to(a, (2, 3)))
# [[1 2 3]
#  [1 2 3]]

# 10. Broadcasting for normalization
data = np.array([[10, 20, 30],
                 [40, 50, 60],
                 [70, 80, 90]])
mean = data.mean(axis=0)
print(data - mean)
# [[-30 -30 -30]
#  [  0   0   0]
#  [ 30  30  30]]