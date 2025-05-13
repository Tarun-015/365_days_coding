import java.util.Scanner;

public class Student {
    String name;
    int rollNo;
    float cgpa;
    boolean backlog;
    
    // Constructor to initialize the student object
    Student(String name, int rollNo, float cgpa, boolean backlog) {
        this.name = name;
        this.rollNo = rollNo;
        this.cgpa = cgpa;
        this.backlog = backlog;
    }

    void sleeping() {
        System.out.println("Student is sleeping");
    }

    void reading() {
        System.out.println("Student is reading");
    }
    
    void studying() {
        System.out.println("Student is studying");
    }
    
    void backloging() {
        System.out.println("Does student have backlog: " + backlog);
    }

    // Main method to interact with the user
    public static void main(String[] args) {
        // Creating an object of the Student class
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter student's name: ");
        String name = scanner.nextLine();
        
        System.out.println("Enter student's roll number: ");
        int rollNo = scanner.nextInt();
        
        System.out.println("Enter student's CGPA: ");
        float cgpa = scanner.nextFloat();
        
        System.out.println("Does the student have a backlog? (true/false): ");
        boolean backlog = scanner.nextBoolean();
        
        // Creating a Student object with user input
        Student student = new Student(name, rollNo, cgpa, backlog);
        
        // Calling the methods
        student.sleeping();
        student.reading();
        student.studying();
        student.backlogging();
        
        scanner.close();  // Close scanner to prevent resource leak
    }
}
