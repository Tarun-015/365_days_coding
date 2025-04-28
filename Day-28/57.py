# Write a recursive function named linear that accepts the following arguments:

# P: a non-empty list of positive integers
# Q: a non-empty list of positive integers
# k: a positive integer
# It should return True only if both the conditions given below are satisfied:
# P[i]=k⋅Q[i], for every integer 
# [0,len(P)−1], endpoints inclusive.
# You do not have to accept input from the user or print output to the console. You just have to write the function definition.

def linear(P, Q, k):
    if len(P) != len(Q):
        return False
    if len(P) == 0:
        return True
    if P[0] / Q[0] != k:
        return False
    return linear(P[1: ], Q[1: ], k)