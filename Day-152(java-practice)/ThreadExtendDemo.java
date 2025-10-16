// Create a thread by extending Thread class
class MyThread extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
        }
    }
}

public class ThreadExtendDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("ChildThread");
        t1.start();

        for(int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Main Count: " + i);
        }
    }
}


// 💡Explanation:

// start() method creates a new thread and calls run() internally.

// The main thread and child thread run concurrently.