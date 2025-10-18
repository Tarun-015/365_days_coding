// Basic Example — wait() and notify()
class SharedResource {
    private boolean isAvailable = false;

    public synchronized void produce() {
        System.out.println("Producer started...");
        isAvailable = true;
        System.out.println("Produced item!");
        notify(); // wake up waiting consumer
    }

    public synchronized void consume() throws InterruptedException {
        System.out.println("Consumer waiting...");
        while (!isAvailable) {
            wait(); // release lock & wait until notified
        }
        System.out.println("Consumed item!");
        isAvailable = false;
    }
}

public class WaitNotifyDemo {
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            try {
                Thread.sleep(1000);
                resource.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                resource.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        consumer.start();
        producer.start();

        consumer.join();
        producer.join();
    }
}

//  Output:
// Consumer waiting...
// Producer started...
// Produced item!
// Consumed item!