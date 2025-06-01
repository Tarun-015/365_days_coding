##bubble sort

def bubble_sort(l):
  for i in range(len(l)):
    for j in range(len(l)-i-1):
      if(l[j]>l[j+1]):
        temp=l[j]
        l[j]=l[j+1]
        l[j+1]=temp
  return l

user_list=list(map(int,input().split()))
print(bubble_sort(user_list))