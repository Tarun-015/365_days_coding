abstract class Shape {
    abstract void draw(); // abstract method
    void info() {
        System.out.println("All shapes have area");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }

    public static void main(String[] args) {
        Shape s = new Circle(); // dynamic binding
        s.draw();
        s.info();
    }
}
