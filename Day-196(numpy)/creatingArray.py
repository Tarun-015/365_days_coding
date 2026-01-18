import numpy as np

# From Python list / tuple
a = np.array([1, 2, 3])                  
b = np.array([[1, 2, 3], [4, 5, 6]])

# Pre-filled arrays
zeros = np.zeros((2, 3))                 # all 0s
ones  = np.ones((3, 2))                  # all 1s
full  = np.full((2, 2), 9)               # all 9s
iden  = np.eye(3)                        # identity matrix

# Ranges / sequences
r1 = np.arange(0, 10, 2)                 # [0, 2, 4, 6, 8]
r2 = np.linspace(0, 1, 5)                # 5 evenly spaced → [0.,0.25,0.5,0.75,1.]
