# Create a dictionary with elements in the list as values and the indices as keys.
# Given a list of items, create a dictionary with the indices as keys and the items as items.


def create_indexed_dict(items: list) -> dict:
    '''
    Given a list of items, create a dictionary with the indices as keys and the items as items.

    Args:
        items (list): A list of items.

    Returns:
        dict: A dictionary with indices as keys and items as items.
    '''
    ...
    j=0
    dict = {}
    for i in items:
       if(j>(len(items)-1)):
           break
       dict.update({j:i})
       j+=1
      
    return dict
