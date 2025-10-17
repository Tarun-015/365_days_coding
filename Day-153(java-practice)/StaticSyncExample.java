// Class-level Lock using static synchronized
class ClassLockDemo {
    private static int counter = 0;

    public static synchronized void increment() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}

public class StaticSyncExample {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                ClassLockDemo.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                ClassLockDemo.increment();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final count (Expected 2000): " + ClassLockDemo.getCounter());
    }
}


//  static synchronized locks on the Class object, not instance-level.