# Set of Unique vowels in a string.
# Given a string, return a set of unique vowels present in the string.

# Examples

# >>> unique_vowels('banana treat')
# {'a', 'e'}
# >>> unique_vowels('apple lolipop')
# {'a', 'e', 'i', 'o'}


def unique_vowels(s):
    vowels = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'}
    return {char for char in s if char in vowels}

