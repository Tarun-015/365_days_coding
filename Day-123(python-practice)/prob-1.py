# Q1 (Basic)

# Problem: Write an async function that waits 2 seconds before printing "Hello Async".

import asyncio

async def say_hello():
    await asyncio.sleep(2)
    print("Hello Async")

asyncio.run(say_hello())
