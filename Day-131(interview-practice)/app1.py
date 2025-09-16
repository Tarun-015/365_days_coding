#Method 1: Using a Loop (backward indexing)
lst = [10, 20, 30, 40, 50]

for i in range(len(lst)-1, -1, -1):
    print(lst[i], end=" ")



#Method 2: Using a While Loop
lst = [1, 2, 3, 4, 5]

i = len(lst) - 1
while i >= 0:
    print(lst[i], end=" ")
    i -= 1



# Method 3: Using Recursion
def print_reverse(lst, i):
    if i < 0:
        return
    print(lst[i], end=" ")
    print_reverse(lst, i-1)

lst = [100, 200, 300, 400]
print_reverse(lst, len(lst)-1)


# Output:
# 400 300 200 100
