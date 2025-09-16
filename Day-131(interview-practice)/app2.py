# Reverse a List Without Builtins (print, slicing, reverse, reversed`)
import sys

lst = [10, 20, 30, 40, 50]

i = len(lst) - 1
while i >= 0:
    sys.stdout.write(str(lst[i]) + " ")
    i -= 1




#Recursive Way (still without print)
import sys

def display_reverse(lst, i):
    if i < 0:
        return
    sys.stdout.write(str(lst[i]) + " ")
    display_reverse(lst, i-1)

lst = [1, 2, 3, 4, 5]
display_reverse(lst, len(lst)-1)


# Output:

# 5 4 3 2 1 