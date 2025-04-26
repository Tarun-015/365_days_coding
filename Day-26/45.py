# Delete the first three elements in a list
# Given a list l, modify it in place by deleting the first three elements. If the list has fewer than three elements, delete all elements.

# Example

# l = [1, 2, 3, 4, 5]
# After deleting the first three elements, the list becomes [4, 5].



def delete_first_three(l: list) -> None:
    '''
    Given a list, delete the first three elements in the list.

    Arguments:
    l: list - a list of elements.

    Return: None - the list is modified in place.
    '''
    
    
    del l[:3]
    

