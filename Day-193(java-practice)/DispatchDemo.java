class Shape {
    void draw() { System.out.println("Drawing Shape"); }
}

class Rectangle extends Shape {
    void draw() { System.out.println("Drawing Rectangle"); }
}

class Circle extends Shape {
    void draw() { System.out.println("Drawing Circle"); }
}

public class DispatchDemo {
    public static void main(String[] args) {
        Shape s;
        s = new Rectangle();
        s.draw();   // Rectangle version
        s = new Circle();
        s.draw();   // Circle version
    }
}
