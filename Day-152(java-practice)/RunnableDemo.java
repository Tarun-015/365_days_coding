// Create a thread by implementing Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Running: " + i);
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();

        for(int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Main: " + i);
        }
    }
}


// 💡Explanation:

// Runnable is preferred when your class already extends another class.

// Thread object takes the Runnable instance and starts it.