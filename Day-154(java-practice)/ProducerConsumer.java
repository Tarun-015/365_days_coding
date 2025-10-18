// Producer-Consumer Problem

// This is the classic real-world use case of inter-thread communication.

import java.util.LinkedList;
import java.util.Queue;

class Buffer {
    private final int CAPACITY = 3;
    private final Queue<Integer> queue = new LinkedList<>();

    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == CAPACITY) {
            wait(); // wait if full
        }
        queue.add(value);
        System.out.println("Produced: " + value);
        notifyAll(); // wake up consumers
    }

    public synchronized void consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait(); // wait if empty
        }
        int val = queue.remove();
        System.out.println("Consumed: " + val);
        notifyAll(); // wake up producers
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    buffer.produce(i);
                    Thread.sleep(500);
                } catch (InterruptedException e) {}
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    buffer.consume();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
            }
        });

        producer.start();
        consumer.start();
    }
}


//  Output Example:

// Produced: 1
// Produced: 2
// Consumed: 1
// Produced: 3
// Consumed: 2
// Produced: 4
// Consumed: 3
// Produced: 5
// Consumed: 4
// Consumed: 5