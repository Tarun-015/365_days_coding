// Implement Queue Operations using LinkedList
import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println("Queue Elements: " + queue);

        System.out.println("Peek: " + queue.peek());
        System.out.println("Removed: " + queue.poll());
        System.out.println("After Removal: " + queue);
    }
}


// Concept:
// Queue follows FIFO (First-In-First-Out) order.
// Used in scheduling, buffering, and resource management.