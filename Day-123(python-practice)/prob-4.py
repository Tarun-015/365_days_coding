# Q4 (Hero)

# Problem: Simulate a chat between two async users sending alternate messages.

import asyncio

async def user1():
    messages = ["Hi", "How are you?", "What’s up?", "Bye"]
    for m in messages:
        print("User1:", m)
        await asyncio.sleep(1)

async def user2():
    replies = ["Hello", "I'm fine", "Just coding", "See you"]
    for r in replies:
        await asyncio.sleep(1)
        print("User2:", r)

async def main():
    await asyncio.gather(user1(), user2())

asyncio.run(main())
