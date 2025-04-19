# Note this prefix code is to verify that you are not using any for loops in this exercise. This won't affect any other functionality of the program.
with open(__file__) as f:
    content = f.read().split("# <nofor>")[2]
if "for " in content:
    print("You should not use for loop or the word for anywhere in this exercise")

# The values of the below variables will be changed by the evaluator
int_iterable = range(1,10,3)
string_iterable = ["Apple","Orange", "Banana"]
some_value = 4
some_collection = [1,2,3] # list | set | tuple 

some_iterable = (1,2,3)
another_iterable = {"apple", "banana", "cherry"} # can be any iterable
yet_another_iterable = range(1,10)

# <nofor>
# <eoi>


# Empty collections
empty_list = []
empty_set = set()
empty_tuple = ()

# Singleton collections
singleton_list = [1]
singleton_set = {1}
singleton_tuple = (1,)

# Truthy and falsy collections
a_falsy_list = []  # An empty list is falsy
a_falsy_set = set()  # An empty set is falsy
a_truthy_tuple = (1, 2, 3)  # A non-empty tuple is truthy

# Performing operations on int_iterable
int_iterable_min = min(int_iterable)
int_iterable_max = max(int_iterable)
int_iterable_sum = sum(int_iterable)
int_iterable_len = len(int_iterable)
int_iterable_sorted = sorted(int_iterable)
int_iterable_sorted_desc = sorted(int_iterable, reverse=True)

# Checking reversibility and sorting if necessary
try:
    int_iterable_reversed = list(reversed(int_iterable))
except TypeError:
    int_iterable_reversed = list(reversed(sorted(int_iterable)))

# Checking indexability
try:
    third_last_element = some_collection[-3]
except (TypeError, IndexError):
    third_last_element = None

# Checking slicability
try:
    odd_index_elements = some_collection[1::2]
except TypeError:
    odd_index_elements = None

# Membership check
is_some_value_in_some_collection = some_value in some_collection

# Checking order
try:
    is_some_value_in_even_indices = some_value in some_collection[0::2]
except TypeError:
    is_some_value_in_even_indices = None

# Concatenating all iterables into a list
all_iterables = list(some_iterable) + list(another_iterable) + list(yet_another_iterable)

# Concatenating strings
if isinstance(string_iterable, (list, tuple)):
    all_concat = '-'.join(string_iterable)
else:  # Assuming it's a set or unordered iterable
    all_concat = '-'.join(sorted(string_iterable))