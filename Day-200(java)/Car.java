class Engine {
    void start() {
        System.out.println("Engine started...");
    }
}

public class Car {
    private final Engine engine; // strong dependency

    Car() {
        engine = new Engine(); // created inside class
    }

    void drive() {
        engine.start();
        System.out.println("Car is running...");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
}