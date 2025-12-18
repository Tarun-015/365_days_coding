import java.util.*;

class Astra {
    private String name;
    private boolean inUse = false;

    public Astra(String name) {
        this.name = name;
    }

    // synchronized so only one warrior can use an Astra at a time
    public synchronized int use(String warriorName) {
        System.out.println(warriorName + " is trying to claim " + name + " 🔱");

        while (inUse) {  // BLOCKED state
            try {
                System.out.println("❌ " + name + " is already in use. " + warriorName + " waits 🕒");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        inUse = true;
        System.out.println("✅ " + warriorName + " wields " + name + "! ⚔️");

        try {
            System.out.println("😴 " + warriorName + " is preparing a divine strike with " + name + "...");
            Thread.sleep(1000 + (int)(Math.random() * 1000)); // sleep = preparing attack
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int score = (int)(Math.random() * 100); // random score for attack power
        System.out.println("💥 " + warriorName + " unleashes " + name + " causing " + score + " damage points!");

        inUse = false;
        notifyAll();  // other threads can now use this astra
        return score;
    }
}

class Warrior extends Thread {
    private String name;
    private Astra[] astras;
    private int totalScore = 0;
    private volatile boolean paused = false;

    public Warrior(String name, Astra[] astras) {
        this.name = name;
        this.astras = astras;
    }

    public void pauseWarrior() {
        paused = true;
        System.out.println("💤 " + name + " takes a strategic rest (PAUSED).");
    }

    public void resumeWarrior() {
        paused = false;
        synchronized (this) {
            notify();
        }
        System.out.println("⚡ " + name + " returns to the battlefield!");
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
        System.out.println("🏹 " + name + " enters the battlefield! (RUNNABLE → RUNNING)");

        for (int i = 0; i < 3; i++) { // Each warrior gets 3 turns
            checkPaused();

            // Randomly choose an Astra
            Astra chosen = astras[new Random().nextInt(astras.length)];

            int score = chosen.use(name);
            totalScore += score;

            try {
                Thread.sleep(500); // short break between turns
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("🏁 " + name + " ends battle with total score: " + totalScore + " 🪔");
    }

    public int getTotalScore() {
        return totalScore;
    }

    public String getWarriorName() {
        return name;
    }
}

public class MahabharataGame {
    public static void main(String[] args) throws Exception {
        System.out.println("\n⚔️  WELCOME TO THE KURUKSHETRA WAR ⚔️");
        System.out.println("Each warrior will fight for 3 rounds using divine Astras!\n");

        Astra sudarshan = new Astra("Sudarshan Chakra");
        Astra trishul = new Astra("Trishul");
        Astra brahmastra = new Astra("Brahmastra");
        Astra[] astras = { sudarshan, trishul, brahmastra };

        Warrior w1 = new Warrior("Arjuna", astras);
        Warrior w2 = new Warrior("Karna", astras);
        Warrior w3 = new Warrior("Bhishma", astras);
        Warrior w4 = new Warrior("Abhimanyu", astras);

        // Start all threads (warriors)
        w1.start();
        w2.start();
        w3.start();
        w4.start();

        // Pause/Resume demo
        Thread.sleep(2000);
        w3.pauseWarrior();
        Thread.sleep(2000);
        w3.resumeWarrior();

        // Wait for all threads to finish
        w1.join();
        w2.join();
        w3.join();
        w4.join();

        // Show final leaderboard
        System.out.println("\n🏆 FINAL LEADERBOARD 🏆");
        List<Warrior> warriors = Arrays.asList(w1, w2, w3, w4);
        warriors.sort((a, b) -> b.getTotalScore() - a.getTotalScore());

        for (int i = 0; i < warriors.size(); i++) {
            System.out.println((i + 1) + ". " + warriors.get(i).getWarriorName()
                    + " → " + warriors.get(i).getTotalScore() + " points");
        }

        System.out.println("\n🕉️ The war of threads ends in glory! 🕉️");
    }
}
