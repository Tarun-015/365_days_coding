// Semaphore Example

// Controls access to a resource with a fixed number of permits.

import java.util.concurrent.Semaphore;

class ResourceThread extends Thread {
    private Semaphore semaphore;

    ResourceThread(Semaphore semaphore, String name) {
        super(name);
        this.semaphore = semaphore;
    }

    public void run() {
        try {
            System.out.println(getName() + " waiting for permit...");
            semaphore.acquire();
            System.out.println(getName() + " acquired permit!");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(getName() + " releasing permit...");
            semaphore.release();
        }
    }
}

public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2); // only 2 threads allowed at once

        for (int i = 1; i <= 5; i++) {
            new ResourceThread(semaphore, "Thread-" + i).start();
        }
    }
}


//  Output Example

// Thread-1 waiting for permit...
// Thread-1 acquired permit!
// Thread-2 waiting for permit...
// Thread-2 acquired permit!
// Thread-3 waiting for permit...
// Thread-1 releasing permit...
// Thread-3 acquired permit!
// ...