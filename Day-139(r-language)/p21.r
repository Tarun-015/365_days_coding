# Q21. Create and manipulate a matrix
m <- matrix(1:12, nrow=3, byrow=TRUE)
print("Original Matrix:")
print(m)

# Extract 2nd column
print("2nd Column:")
print(m[,2])

# Row sums
print("Row Sums:")
print(rowSums(m))


# Concepts: Matrices, indexing, row operations