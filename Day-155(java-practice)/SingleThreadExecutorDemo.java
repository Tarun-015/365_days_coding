// Single Thread Executor Example

// Executes all tasks sequentially using a single background thread.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        for (int i = 1; i <= 4; i++) {
            int taskNum = i;
            executor.submit(() -> {
                System.out.println(Thread.currentThread().getName() + " executing task " + taskNum);
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
            });
        }

        executor.shutdown();
    }
}


//  Output Example

// pool-1-thread-1 executing task 1
// pool-1-thread-1 executing task 2
// pool-1-thread-1 executing task 3
// pool-1-thread-1 executing task 4