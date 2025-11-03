// Using the Custom Annotation
// File: DemoAnnotation.java
public class DemoAnnotation {

    @MyAnnotation(author = "Tarun Chaudhary", date = "2025-10-08")
    public void display() {
        System.out.println("Custom Annotation Applied!");
    }

    public static void main(String[] args) {
        DemoAnnotation obj = new DemoAnnotation();
        obj.display();
    }
}


// Output:

// Custom Annotation Applied!