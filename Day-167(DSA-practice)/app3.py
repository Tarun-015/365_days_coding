# Python Code Using List + Dict

# You can simulate a queue using a list, but you need to pop elements from front that are repeating:

s = "aabc"
d = {}
l = []      # list to simulate queue
result = ""

for ch in s:
    d[ch] = d.get(ch, 0) + 1
    l.append(ch)

    # remove repeated chars from front
    while l and d[l[0]] > 1:
        l.pop(0)

    # append current first non-repeating
    if l:
        result += l[0]
    else:
        result += '#'

print(result)
