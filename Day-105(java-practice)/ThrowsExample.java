public class ThrowsExample {
    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Underage - not allowed");
        }
        System.out.println("Access granted");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}


// output:
// Caught: Underage - not allowed
