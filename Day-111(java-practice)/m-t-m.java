// Course.java
import java.util.*;

public class Course {
    String courseName;
    List<Student> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void showStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : students) {
            System.out.println(" - " + s.name);
        }
    }
}

// Student.java
import java.util.*;

public class Student {
    int id;
    String name;
    List<Course> courses = new ArrayList<>();

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void enroll(Course c) {
        courses.add(c);
        c.addStudent(this); // maintain both sides
    }

    public void showCourses() {
        System.out.println("Student: " + name);
        for (Course c : courses) {
            System.out.println(" - " + c.courseName);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Tarun");
        Student s2 = new Student(102, "Aarav");

        Course c1 = new Course("Java");
        Course c2 = new Course("Python");

        s1.enroll(c1);
        s1.enroll(c2);
        s2.enroll(c1);

        s1.showCourses();
        s2.showCourses();

        c1.showStudents();
        c2.showStudents();
    }
}

// o/p :
// Student: Tarun
//  - Java
//  - Python
// Student: Aarav
//  - Java

// Course: Java
//  - Tarun
//  - Aarav
// Course: Python
//  - Tarun
