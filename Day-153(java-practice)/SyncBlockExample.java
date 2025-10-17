// Synchronization Block Example
class BlockSync {
    private int balance = 1000;

    public void deposit(int amount) {
        synchronized (this) {
            balance += amount;
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class SyncBlockExample {
    public static void main(String[] args) throws InterruptedException {
        BlockSync account = new BlockSync();

        Thread t1 = new Thread(() -> account.deposit(500));
        Thread t2 = new Thread(() -> account.deposit(300));

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final balance: " + account.getBalance());
    }
}