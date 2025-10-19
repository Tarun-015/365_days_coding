// Callable and Future Example

// Unlike Runnable, Callable can return a value and throw exceptions.

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class SquareCalculator implements Callable<Integer> {
    private int number;

    SquareCalculator(int number) {
        this.number = number;
    }

    public Integer call() throws Exception {
        System.out.println("Calculating square for: " + number);
        Thread.sleep(1000);
        return number * number;
    }
}

public class CallableFutureDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<Integer> f1 = executor.submit(new SquareCalculator(5));
        Future<Integer> f2 = executor.submit(new SquareCalculator(10));

        System.out.println("Square of 5: " + f1.get());
        System.out.println("Square of 10: " + f2.get());

        executor.shutdown();
    }
}


// Output Example

// Calculating square for: 5
// Calculating square for: 10
// Square of 5: 25
// Square of 10: 100