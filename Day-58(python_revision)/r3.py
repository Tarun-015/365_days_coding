# Write a program to: 
# ● Take two sets of student names (Set A and Set B). 
# ● Print students who are only in Set A. 
# ● Print students common to both sets. 
# ● Print all unique students from both sets.

def set_opr_difference(setA,setB):
        print(setA-setB)

def set_opr_common(setA,setB):
    common=setA & setB
    print(common)

def set_opr_unique(setA,setB):
    diff1=setA-setB
    diff2=setB-setA
    print(diff1|diff2)
    
setA = set(input().split())
setB = set(input().split())
set_opr_difference(setA,setB)
set_opr_common(setA,setB)
set_opr_unique(setA,setB)