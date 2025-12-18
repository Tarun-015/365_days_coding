class Astra {
    private String name;
    private boolean inUse = false;

    public Astra(String name) {
        this.name = name;
    }

    // synchronized ensures ek time pe ek hi warrior astra use kare
    public synchronized void use(String warriorName) {
        System.out.println(warriorName + " is trying to access " + name + " 🔱");

        // agar astra already use me hai, wait karo (BLOCKED state)
        while (inUse) {
            try {
                System.out.println(name + " is already in use! " + warriorName + " is waiting 🕒");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        inUse = true;
        System.out.println(warriorName + " got " + name + " ⚔️");

        try {
            System.out.println(warriorName + " is using " + name + " (SLEEPING) 😴");
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(warriorName + " has finished using " + name + " 🙏");
        inUse = false;
        notifyAll(); // jagao baaki threads ko
    }
}


class Warrior extends Thread {
    private String name;
    private Astra astra;
    private volatile boolean paused = false; // custom pause flag

    public Warrior(String name, Astra astra) {
        this.name = name;
        this.astra = astra;
    }

    
    public void pauseWarrior() {
        paused = true;
        System.out.println("💤 " + name + " takes a divine pause (PAUSED).");
    }

    
    public void resumeWarrior() {
        paused = false;
        synchronized (this) {
            notify();
        }
        System.out.println("⚡ " + name + " resumes fighting!");
    }

    private synchronized void checkPaused() {
        while (paused) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void run() {
        System.out.println(name + " has entered the battlefield (RUNNABLE → RUNNING) 🏹");

        try {
            Thread.sleep((int)(Math.random() * 1000)); // random delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        checkPaused(); 

        astra.use(name);

        System.out.println(name + " leaves the field (TERMINATED) ⚰️");
    }
}

public class MahabharataBattle {
    public static void main(String[] args) throws Exception {
        Astra sudarshan = new Astra("Sudarshan Chakra");
        Astra trishul = new Astra("Trishul");
        Astra brahmastra = new Astra("Brahmastra");

        Warrior w1 = new Warrior("Arjuna", brahmastra);
        Warrior w2 = new Warrior("Karna", trishul);
        Warrior w3 = new Warrior("Bhishma", sudarshan);
        Warrior w4 = new Warrior("Drona", brahmastra);
        Warrior w5 = new Warrior("Abhimanyu", trishul);

        System.out.println("⚔️  Battle of Kurukshetra Begins ⚔️\n");

        w1.start();
        w2.start();
        w3.start();
        w4.start();
        w5.start();

        
        Thread.sleep(2000);
        w3.pauseWarrior();

        
        Thread.sleep(2000);
        w3.resumeWarrior();
    }
}
