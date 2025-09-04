>> Coroutines (async/await)

What are Coroutines?

  A coroutine is a special kind of function that can pause execution and later resume from the same point.
  
  They are used for asynchronous programming → meaning tasks can run without blocking each other.
  
  In Python, coroutines are defined using the async def keyword.
  
  They are executed with the help of an event loop (usually via asyncio).
  

async and await

  async → used to declare a coroutine function.
  
  await → pauses the coroutine until the awaited task is done (without blocking other tasks)..
