// ScheduledExecutor Example

// Used to schedule tasks for delayed or periodic execution (like timers).

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorDemo {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable task = () -> System.out.println("Running task at: " + System.currentTimeMillis());

        System.out.println("Scheduling task...");
        scheduler.scheduleAtFixedRate(task, 2, 3, TimeUnit.SECONDS); // initial delay: 2s, repeat every 3s
    }
}


//  Output Example

// Scheduling task...
// Running task at: 1728405400000
// Running task at: 1728405403000
// Running task at: 1728405406000