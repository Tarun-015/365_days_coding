// Using Lambda with Functional Interface

@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

public class LambdaFunctionalInterface {
    public static void main(String[] args) {
        Greeting greet = name -> System.out.println("Hello, " + name + "!");
        greet.sayHello("Tarun");
        greet.sayHello("Java");
    }
}
