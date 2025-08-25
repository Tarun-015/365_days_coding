class MyDescriptor:
    def __get__(self, instance, owner):
        print("Getting value...")
        return instance.__dict__.get("value", None)

    def __set__(self, instance, value):
        print(f"Setting value to {value}")
        instance.__dict__["value"] = value

    def __delete__(self, instance):
        print("Deleting value...")
        del instance.__dict__["value"]


class MyClass:
    attr = MyDescriptor()   # descriptor bound to this class attribute


obj = MyClass()
obj.attr = 42        # calls __set__
print(obj.attr)      # calls __get__
del obj.attr         # calls __delete__


# o/p :
# Setting value to 42
# Getting value...
# 42
# Deleting value...
