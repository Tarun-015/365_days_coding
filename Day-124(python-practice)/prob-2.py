# Problem 2: Benchmark Slots vs Normal

import sys, time

class Normal:
    def __init__(self, x, y): self.x, self.y = x, y

class Slot:
    __slots__ = ('x', 'y')
    def __init__(self, x, y): self.x, self.y = x, y

start = time.time()
objs = [Normal(i, i) for i in range(1000000)]
print("Normal:", sys.getsizeof(objs), "bytes, Time:", time.time()-start)

start = time.time()
objs = [Slot(i, i) for i in range(1000000)]
print("Slots:", sys.getsizeof(objs), "bytes, Time:", time.time()-start)
