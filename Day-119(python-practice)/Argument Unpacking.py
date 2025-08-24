# Q4. Unpacking & *args / **kwargs

# Write a function student_details(name, age, **kwargs) that prints the student’s name, age, and any extra keyword details (like course="Data Science", city="Chennai").
# 👉 Test it by unpacking a dictionary into the function.

def student_details(name, age, **kwargs):
    print(f"Name: {name}, Age: {age}")
    for key, value in kwargs.items():
        print(f"{key}: {value}")

# Example dict
extra = {"course": "Data Science", "city": "Chennai"}

student_details("Tarun", 21, **extra)


# o/p :
# Name: Tarun, Age: 21
# course: Data Science
# city: Chennai
