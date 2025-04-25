# Most frequent first letter of a word in a multiline passage.
# Given a multi-line passage where the words are separated by spaces, find the letter which occurs most frequently as the first letter of any word. Consider both uppercase and lowercase letters as the same and return the letter in lowercase.

# Assume there will be only one letter that occurs the most number of times as the first letter of a word.

# Example:

# passage = '''
# word1 Word2 word3 word4 text1 text2
# text3 Text4 word5 text5 word6
# python1 python2 Python3
# '''
# The function will return "w" because "w" is the most frequently occurring first letter.


def most_occuring_first_letter(passage: str) -> str:
    '''
    Returns the letter which occurs most frequently 
    as the first letter of any word.(case insensitive)

    Args:
        passage (str): A multi-line string representing the passage.

    Returns:
        str: The most frequently occurring first letter in lowercase.
    '''
    
    
    first_letter_counts = {}
    for word in passage.lower().split(): 
        first_letter = word[0]
        if first_letter not in first_letter_counts:
            first_letter_counts[first_letter] = 0
        first_letter_counts[first_letter] += 1

    return max(first_letter_counts, key=first_letter_counts.get)
    

