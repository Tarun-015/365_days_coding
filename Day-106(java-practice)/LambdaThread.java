// Lambda in Thread Creation

public class LambdaThread {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread running: " + i);
            }
        };

        Thread thread = new Thread(task);
        thread.start();
    }
}
