# Q3 (Advanced)

# Problem: Implement a producer-consumer model with asyncio. Producer generates random numbers, consumer processes them.

import asyncio, random

async def producer(queue):
    for _ in range(5):
        item = random.randint(1, 100)
        await queue.put(item)
        print(f"Produced {item}")
        await asyncio.sleep(1)

async def consumer(queue):
    while True:
        item = await queue.get()
        print(f"Consumed {item*2}")
        queue.task_done()

async def main():
    q = asyncio.Queue()
    await asyncio.gather(producer(q), consumer(q))

asyncio.run(main())
