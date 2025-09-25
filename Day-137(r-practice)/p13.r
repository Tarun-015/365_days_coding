# Q13. Apply a function to a vector (higher-order functions)
nums <- c(1, 2, 3, 4, 5)
squared <- sapply(nums, function(x) x^2)
print(squared)


# Concept: Using sapply() with an anonymous function.
# Expected Output:

# [1]  1  4  9 16 25