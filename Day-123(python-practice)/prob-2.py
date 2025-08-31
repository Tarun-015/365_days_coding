# Q2 (Intermediate)

# Problem: Run three async functions concurrently that each print a message after 1 second.

import asyncio

async def task(name):
    await asyncio.sleep(1)
    print(f"Task {name} done")

async def main():
    await asyncio.gather(task("A"), task("B"), task("C"))

asyncio.run(main())


# Output:

# Task A done
# Task B done
# Task C done