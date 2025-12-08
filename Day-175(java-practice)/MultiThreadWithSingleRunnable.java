import java.util.Scanner;
class Demo implements Runnable {
    public void run() {
       Thread t = Thread.currentThread();
       String na = t.getName();
       if(na.equals("bank")){
        Banking();
       }
       else if(na.equals("add")){
        adding();
       }
       else{
        printing();
       }

    }

    public void Banking(){
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
        System.out.println("Banking Task Completed.\n");
    }

    public void adding(){
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
        System.out.println("Adding Task Completed.\n");
    }

    public void printing(){
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



public class MultiThreadWithSingleRunnable {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread Started...\n");

        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();

        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);
        Thread t3 = new Thread(d3);

        t1.setName("bank");
        t2.setName("add");
        t3.setName("print");
       
        t1.start();
        t2.start();
        t3.start();

         
        System.out.println("Main Thread Ended..."); //yeh phela start ho bhi raha h and finish bhi ho jayega
    }
}
