# Q2. Read-Only Descriptor

# Create a descriptor ReadOnly that allows setting an attribute only once (like constants).

class Config:
    version = ReadOnly("1.0")

c = Config()
print(c.version)   # 1.0
c.version = "2.0"  #  raises AttributeError
