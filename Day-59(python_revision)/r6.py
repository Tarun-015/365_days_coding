# Write a function simple_interest(p, t, r) that returns simple interest. 
# Use keyword arguments to call the function. 
# Formula: S.I. = (P × R × T) / 100 
# Also, write a function to calculate P if S.I, R, and T are known. 

def simple_interest(p, t, r):
    si=(p*r*t)/100
    print(si)

p=float(input())
t=int(input())
r=float(input())
simple_interest(p, t, r)