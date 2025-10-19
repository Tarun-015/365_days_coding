// Fixed Thread Pool Example
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {
    private String name;

    WorkerThread(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " started task: " + name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " finished task: " + name);
    }
}

public class FixedThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3); // pool of 3 threads

        for (int i = 1; i <= 6; i++) {
            Runnable worker = new WorkerThread("Task-" + i);
            executor.execute(worker); // submit tasks to the pool
        }

        executor.shutdown();
        System.out.println("All tasks submitted!");
    }
}


//  Output Example

// pool-1-thread-1 started task: Task-1
// pool-1-thread-2 started task: Task-2
// pool-1-thread-3 started task: Task-3
// pool-1-thread-1 finished task: Task-1
// pool-1-thread-1 started task: Task-4
// pool-1-thread-2 finished task: Task-2
// pool-1-thread-2 started task: Task-5
// pool-1-thread-3 finished task: Task-3
// pool-1-thread-3 started task: Task-6
// All tasks submitted!
