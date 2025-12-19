class LinkedList:
    def __init__(self):
        self.head = None  # initially empty list

    # Insert new node at end
    def insert(self, data):
        new_node = Node(data)

        if self.head is None:
            self.head = new_node
            return
        
        temp = self.head
        while temp.next:      # move till last node
            temp = temp.next
        temp.next = new_node  # attach new node

    # Print linked list
    def printList(self):
        temp = self.head
        while temp:
            print(temp.data, end=" -> ")
            temp = temp.next
        print("None")
