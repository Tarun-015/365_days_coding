# Example 2: Patching a Built-in Module (Dangerous!)

import math

# Patch math.sqrt to always return 42 😅
def fake_sqrt(x):
    return 42

math.sqrt = fake_sqrt

print(math.sqrt(9))   # 42 (wrong but patched!)
