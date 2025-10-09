// PriorityQueue Example (Min-Heap Behavior)
import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);

        System.out.println("PriorityQueue Elements: " + pq);

        while (!pq.isEmpty()) {
            System.out.println("Polling Element: " + pq.poll());
        }
    }
}


// Concept:
// PriorityQueue automatically orders elements based on natural ordering (min-heap).
// Useful in job scheduling, shortest path algorithms (Dijkstra), etc.