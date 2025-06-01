# Write a Python program that merges two dictionaries and sums the values of common keys.
# Example:
# python
# CopyEdit
# d1 = {'a': 100, 'b': 200}
# d2 = {'a': 300, 'c': 400}
# # Output: {'a': 400, 'b': 200, 'c': 400}

def dict_opr(d1,d2):
    d={}

    for i in d1:
        d[i] = d1[i]

    for i in d2:
        if i in d:
            d[i] += d2[i]
        else:
            d[i] = d2[i]

    return d


d1 = {}
n = int(input("number of items: "))
for i in range(n):
    key = input("key: ")
    value = int(input("value: "))
    d1[key] = value

d2 = {}
n = int(input("number of items: "))
for i in range(n):
    key = input("key: ")
    value = int(input("value: "))
    d2[key] = value


print(dict_opr(d1,d2))