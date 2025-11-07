// Create a Demo Class with Annotated Methods
public class TaskRunner {

    @RunMe("Task 1 started")
    public void task1() {
        System.out.println("Running Task 1...");
    }

    @RunMe("Task 2 started")
    public void task2() {
        System.out.println("Running Task 2...");
    }

    public void normalMethod() {
        System.out.println("This should NOT auto-run!");
    }
}