public class LinkedList {

    // 🔒 private inner Node class
    private class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    private Node head;  // list starts here

    // Add a node at the beginning
    public void add(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    // Display the list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
