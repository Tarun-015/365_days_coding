# Example 3: Testing with Monkey Patching

# Commonly used in unit tests to replace slow/complex functions with mock versions.

import time

def slow_function():
    time.sleep(5)
    return "Done"

# Patch time.sleep to skip waiting
def fast_sleep(seconds):
    print(f"[Skipping sleep of {seconds}s]")

time.sleep = fast_sleep   # patching

print(slow_function())  


# Output:

# [Skipping sleep of 5s]
# Done