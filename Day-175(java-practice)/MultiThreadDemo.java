import java.util.Scanner;
class Banking extends Thread {
    public void run() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Banking Task Started...");
            System.out.print("Enter Account Number: ");
            int accNo = sc.nextInt();
            System.out.print("Enter Password: ");
            int password = sc.nextInt();
            Thread.sleep(5000);
            System.out.println("Collect your cash");
            System.out.println("Banking Task Completed.\n");
        } catch (InterruptedException e) {
            System.out.println("Banking Interrupted");
        }
    }
}

class Addition extends Thread {
    public void run() {
        try {
            System.out.println("Addition Task Started...");
            int num1 = 10, num2 = 20;
            Thread.sleep(2000); 
            int res = num1 + num2;
            System.out.println("Result = " + res);
            System.out.println("Addition Task Completed.\n");
        } catch (InterruptedException e) {
            System.out.println("Addition Interrupted");
        }
    }
}

class Printing extends Thread {
    public void run() {
        System.out.println("Printing Task Started...");
        for (char c = 'a'; c < 'f'; c++) {
            System.out.println(c);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println("Printing Interrupted");
            }
        }
        System.out.println("Printing Task Completed.\n");
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread Started...\n");

        Banking t1 = new Banking();
        Addition t2 = new Addition();
        Printing t3 = new Printing();

        // t1.run();
        // t2.run();
        // t3.run(); // manual style of execution

       

        System.out.println(t1);
        System.out.println(t2);
         System.out.println(t3);

        t1.getName();
        t1.start();
        t2.start();
        t3.start();

         System.out.println(t1.isAlive());
        t1.join();
        t2.join();
        System.out.println(t1.isAlive());
        t3.join();

        System.out.println("Main Thread Ended..."); //yeh phela start ho bhi raha h and finish bhi ho jayega
    }
}
