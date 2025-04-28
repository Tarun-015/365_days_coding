# Write a recursive function named reverse that accepts a list L as argument and returns the reversed list.

# You do not have to accept input from the user or print output to the console. You just have to write the function definition.

def reverse(L):
    if len(L) <= 1:
        return L
    # Bring the last element to the front
    # And reverse the first n - 1 elements
    return [L[-1]] + reverse(L[:-1])