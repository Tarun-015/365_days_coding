class Queue {
    int value;
    boolean hasValue = false;

    synchronized void put(int i) {
        while (hasValue) {
            try { wait(); } catch (InterruptedException e) {}
        }
        value = i;
        hasValue = true;
        System.out.println("Produced: " + i);
        notify(); // wake up consumer
    }

    synchronized int get() {
        while (!hasValue) {
            try { wait(); } catch (InterruptedException e) {}
        }
        System.out.println("Consumed: " + value);
        hasValue = false;
        notify(); // wake up producer
        return value;
    }
}

class Producer extends Thread {
    Queue q;
    Producer(Queue q) { this.q = q; }

    public void run() {
        int i = 0;
        while (i < 5) {
            q.put(i++);
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

class Consumer extends Thread {
    Queue q;
    Consumer(Queue q) { this.q = q; }

    public void run() {
        while (true) {
            q.get();
            try { Thread.sleep(800); } catch (Exception e) {}
        }
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Queue q = new Queue();
        new Producer(q).start();
        new Consumer(q).start();
    }
}
