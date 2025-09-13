class MyContext:
    def __enter__(self):
        print("Enter block"); return self
    def __exit__(self, exc_type, exc_value, traceback):
        print("Exit block")

with MyContext():
    print("Inside block")
    
    
# Output:


# Enter block  
# Inside block  
# Exit block  