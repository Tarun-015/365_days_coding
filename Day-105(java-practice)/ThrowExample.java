public class ThrowExample {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException("Manually thrown exception");
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}

// output:
// Caught: Manually thrown exception
