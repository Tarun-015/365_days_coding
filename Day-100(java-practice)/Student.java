// Question 1: Basic Encapsulation Usage
//  Create a class Student with the following private fields:

// name (String)

// rollNo (int)

// gpa (float)

// Provide public getters and setters.
// Write a main() method to set and get the values.

public class Student {
    private String name;
    private int rollNo;
    private float gpa;

    public String getName() {
        return name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public float getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Tarun");
        s.setRollNo(101);
        s.setGpa(8.7f);

        System.out.println("Name: " + s.getName());
        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("GPA: " + s.getGpa());
    }
}
