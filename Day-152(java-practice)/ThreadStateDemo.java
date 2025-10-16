// Thread States Demo
public class ThreadStateDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println("Running thread...");
        });

        System.out.println("State before start: " + t.getState());
        t.start();
        System.out.println("State after start: " + t.getState());

        Thread.sleep(100);
        System.out.println("State after completion: " + t.getState());
    }
}


// 💡Explanation:

// NEW → Before start()

// RUNNABLE → After start()

// TERMINATED → After completion