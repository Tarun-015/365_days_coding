# Q3. Logging Descriptor

# Build a descriptor LoggedAttribute that logs every get and set operation.

class User:
    name = LoggedAttribute("name")

u = User()
u.name = "Tarun"   # [LOG] Setting name to Tarun
print(u.name)      # [LOG] Getting name -> Tarun
