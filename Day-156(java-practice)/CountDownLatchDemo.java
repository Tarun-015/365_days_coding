// CountDownLatch Example

// Used when multiple threads need to wait until others have completed certain tasks.

import java.util.concurrent.CountDownLatch;

class Worker extends Thread {
    private CountDownLatch latch;

    Worker(CountDownLatch latch, String name) {
        super(name);
        this.latch = latch;
    }

    public void run() {
        System.out.println(getName() + " started");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        System.out.println(getName() + " finished");
        latch.countDown();
    }
}

public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);

        new Worker(latch, "Worker-1").start();
        new Worker(latch, "Worker-2").start();
        new Worker(latch, "Worker-3").start();

        latch.await();  // wait until count becomes 0
        System.out.println("All workers finished. Proceeding further...");
    }
}


//  Output Example

// Worker-1 started
// Worker-2 started
// Worker-3 started
// Worker-1 finished
// Worker-2 finished
// Worker-3 finished
// All workers finished. Proceeding further...