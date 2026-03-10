class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class SkewedTreeExample {

    public static void main(String[] args) {

        Node root = new Node(10);

        root.right = new Node(20);
        root.right.right = new Node(30);
        root.right.right.right = new Node(40);

        System.out.println("Right Skewed Tree Created");
    }
}