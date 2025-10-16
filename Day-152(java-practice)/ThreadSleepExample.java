// Using Thread.sleep()
class SleepDemo extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(getName() + " -> " + i);
            try {
                Thread.sleep(500); // pause for half a second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class ThreadSleepExample {
    public static void main(String[] args) {
        SleepDemo t1 = new SleepDemo();
        t1.setName("TimerThread");
        t1.start();
    }
}


// 💡Explanation:

// sleep(ms) temporarily pauses a thread.

// It helps simulate time delays or throttled execution.