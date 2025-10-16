// Multiple threads running concurrently
class MultiThread extends Thread {
    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println(getName() + " - Step " + i);
        }
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        MultiThread t1 = new MultiThread();
        MultiThread t2 = new MultiThread();
        t1.setName("Worker-1");
        t2.setName("Worker-2");

        t1.start();
        t2.start();
    }
}


// 💡Explanation:

// Both threads execute in parallel.

// The output order will differ on each run due to CPU scheduling.