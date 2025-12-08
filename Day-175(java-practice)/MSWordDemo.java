import java.util.Scanner;
class MSWord extends Thread{
    public void run() {
       Thread t = Thread.currentThread();
       String na = t.getName();
       if(na.equals("type")){
        typing();
       }
       else if(na.equals("spell")){
        spelling();
       }
       else{
        saving();
       }
    }

    public void typing(){
        try{
            for(int i=0;i<=5;i++){
                System.out.println("typing...");
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println("typing interupted");
        }
    }

    public void spelling(){
        try{
            for(;;){
                System.out.println("checking...");
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println("check the words");
        }
    }

    public void saving(){
        try{
            for(;;){
                System.out.println("saviing...");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("saving interupted");
        }
    }

}

public class MSWordDemo {
    public static void main(String[] args) throws InterruptedException {
        MSWord t1 = new MSWord();
        MSWord t2 = new MSWord();
        MSWord t3 = new MSWord();

        t2.setDaemon(true);
        t1.setPriority(3);

        t3.setDaemon(true);
        t3.setPriority(3);
        
        t1.setName("type");
        t2.setName("spell");
        t3.setName("save");
       
        t1.start();
        t2.start();
        t3.start();
    }
        
}
