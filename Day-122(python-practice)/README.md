##Iterators & Generators##

>>  Iterator 

An iterator is an object that allows you to go through a collection of items one element at a time, without needing to know how the collection is structured internally.
It implements two special methods:

__iter__() → returns the iterator object itself.

__next__() → returns the next item in the sequence, and raises StopIteration when there are no more items.



>> Generator 

A generator is a special kind of function that produces a sequence of values lazily, meaning it generates items one at a time only when needed, instead of creating the whole list at once.
It is defined using the def keyword and the yield statement, which pauses the function and saves its state so it can continue from the same point when called again.



👉 In short:

Iterator → Object for sequential access of elements.

Generator → Shortcut way of creating iterators using yield.
