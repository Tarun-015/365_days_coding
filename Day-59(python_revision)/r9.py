# Write a function multiply_all(*args) that takes any number of numeric arguments and
# returns their product.
# Example: multiply_all(2, 3, 4) should return 24.

def convert_dict(l):
  d={}
  # for i in l:
  #   key=l[0]
  #   val=l[1]
  #   d[key]=val
  for i,j in l:
    d[i]=j
  return d

l1=[]
n=int(input("no.of tuples: "))
for i in range(n):
  tup = []
  for j in range(1):
    v1=input()
    v2=int(input())
    tup.append(v1)
    tup.append(v2)
  tup = tuple(tup)
  l1.append(tup)
convert_dict(l1)