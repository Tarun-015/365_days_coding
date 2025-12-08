import java.util.Scanner;
class Banking implements Runnable {
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

class Addition implements Runnable {
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

class Printing implements Runnable {
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

public class MultiThreadSecondWayDemo {
    public static void main(String[] args) {
        System.out.println("Main Thread Started...\n");

        Banking d1 = new Banking();
        Addition d2 = new Addition();
        Printing d3 = new Printing();  //these re jobs

        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);
        Thread t3 = new Thread(d3);

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Main Thread Ended...");
    }
}
