import java.util.logging.Logger;

public class LoggingExample {
    private static final Logger logger = Logger.getLogger(LoggingExample.class.getName());

    public static void main(String[] args) {
        logger.info("Application started");
        
        int num1 = 5, num2 = 0;
        try {
            int result = num1 / num2;
            logger.info("Result: " + result);
        } catch (ArithmeticException e) {
            logger.severe("Error: Division by zero");
        }
        
        logger.info("Application ended");
    }
}


// output :
// INFO: Application started
// SEVERE: Error: Division by zero
// INFO: Application ended
