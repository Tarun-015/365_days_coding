interface Vehicle {
    void start();  // public + abstract by default
}

interface Engine {
    void fuelType();
}

class Car implements Vehicle, Engine {
    public void start() {
        System.out.println("Car started");
    }
    public void fuelType() {
        System.out.println("Petrol engine");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.fuelType();
    }
}
