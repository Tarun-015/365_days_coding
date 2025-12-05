// Weird But Legal: main() Can Be Overloaded
public class Fact10_OverloadedMain {
    public static void main(String[] args) {
        System.out.println("Main with String[] args");
        main(10);
    }
    public static void main(int x) {
        System.out.println("Overloaded main() called with " + x);
    }
}