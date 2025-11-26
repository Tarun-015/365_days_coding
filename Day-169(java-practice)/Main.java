public class Main {
    public static void main(String[] args) {
        try (Res1 r1 = new Res1();
             Res2 r2 = new Res2();
             Res3 r3 = new Res3()) {
            System.out.println("Inside try block");
        }
    }
}

class Res1 implements AutoCloseable {
    public void close() { System.out.println("Res1 closed"); }
}
class Res2 implements AutoCloseable {
    public void close() { System.out.println("Res2 closed"); }
}
class Res3 implements AutoCloseable {
    public void close() { System.out.println("Res3 closed"); }
}


// Output:

// Inside try block
// Res3 closed
// Res2 closed
// Res1 closed