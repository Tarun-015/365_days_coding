// Using the Annotation
public class AdvancedDemo {

    @Info(date = "2025-10-08", reviewers = {"Aman", "Priya"})
    public void methodOne() {
        System.out.println("Method with full annotation");
    }

    @Info(date = "2025-10-09")
    public void methodTwo() {
        System.out.println("Method with default author and reviewers");
    }

    public static void main(String[] args) throws Exception {
        AdvancedDemo demo = new AdvancedDemo();
        demo.methodOne();
        demo.methodTwo();
    }
}


//  Output:

// Method with full annotation
// Method with default author and reviewers