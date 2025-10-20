// CyclicBarrier Example

// Allows a group of threads to wait for each other before proceeding.

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Task extends Thread {
    private CyclicBarrier barrier;

    Task(CyclicBarrier barrier, String name) {
        super(name);
        this.barrier = barrier;
    }

    public void run() {
        try {
            System.out.println(getName() + " is performing work...");
            Thread.sleep(1000);
            System.out.println(getName() + " waiting at barrier");
            barrier.await();
            System.out.println(getName() + " passed the barrier");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

public class CyclicBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3, () -> System.out.println("All tasks reached the barrier!"));

        new Task(barrier, "Thread-1").start();
        new Task(barrier, "Thread-2").start();
        new Task(barrier, "Thread-3").start();
    }
}


//  Output Example

// Thread-1 is performing work...
// Thread-2 is performing work...
// Thread-3 is performing work...
// Thread-1 waiting at barrier
// Thread-2 waiting at barrier
// Thread-3 waiting at barrier
// All tasks reached the barrier!
// Thread-3 passed the barrier
// Thread-2 passed the barrier
// Thread-1 passed the barrier