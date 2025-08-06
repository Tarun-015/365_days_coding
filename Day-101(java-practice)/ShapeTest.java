// uestion:
// Create a class Shape with a draw() method.

// Overload it in Shape with an argument String color to print "Drawing shape in color".

// Create a Circle subclass that overrides both methods with circle-specific messages.

// Expected Output:

// Drawing a generic shape
// Drawing shape in Red
// Drawing a circle
// Drawing circle in Blue

class Shape {
    public void draw() {
        System.out.println("Drawing a generic shape");
    }

    public void draw(String color) {
        System.out.println("Drawing shape in " + color);
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void draw(String color) {
        System.out.println("Drawing circle in " + color);
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.draw();
        s.draw("Red");

        Circle c = new Circle();
        c.draw();
        c.draw("Blue");
    }
}
