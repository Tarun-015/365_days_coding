# Remove First two and Last two Chars from a string
# Given a string s, return a new string with the first two and last two characters removed.

# If the string has less than four characters return an empty string.

# Example

# s = 'HelloWorld'
# Removing the first two and last two characters results in 'lloWor'.



def remove_edges(s: str) -> str:
    '''
    Return a new string with the first two and last two 
    characters removed from the given string. 

    Arguments:
    s: str - a string.

    Return: str - a string with first and last two characters removed.
    '''
    
    
    return s[2:-2]
    

