# Q4 (Hero)

# Problem: Build an infinite generator that produces random 6-digit OTPs.

import random

def otp_generator():
    while True:
        yield "".join(str(random.randint(0, 9)) for _ in range(6))

gen = otp_generator()
print(next(gen))
print(next(gen))


# Output :

# 492731
# 105983