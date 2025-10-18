// wait() + notifyAll() Example

// Sometimes multiple threads are waiting for the same resource.
// notifyAll() wakes all waiting threads, while notify() wakes only one.

class MultiWaitNotify {
    public synchronized void task(String name) throws InterruptedException {
        System.out.println(name + " is waiting...");
        wait();
        System.out.println(name + " resumed after notifyAll!");
    }
}

public class NotifyAllDemo {
    public static void main(String[] args) throws InterruptedException {
        MultiWaitNotify obj = new MultiWaitNotify();

        Thread t1 = new Thread(() -> {
            try { obj.task("Thread-1"); } catch (InterruptedException e) {}
        });

        Thread t2 = new Thread(() -> {
            try { obj.task("Thread-2"); } catch (InterruptedException e) {}
        });

        t1.start();
        t2.start();

        Thread.sleep(2000);

        synchronized (obj) {
            obj.notifyAll();
            System.out.println("All threads notified!");
        }
    }
}


//  Output Example:

// Thread-1 is waiting...
// Thread-2 is waiting...
// All threads notified!
// Thread-1 resumed after notifyAll!
// Thread-2 resumed after notifyAll!