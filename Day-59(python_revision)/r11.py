#sorting --> selection sort

def selection_sort(l):
  for i in range(len(l)-1):
    min_index=i
    for j in range(i+1,len(l)):
      if l[j]<l[min_index]:
        min_index=j

    temp = l[i]
    l[i]=l[min_index]
    l[min_index]=temp

  return l

user_list=list(map(int,input().split()))
selection_sort(user_list)