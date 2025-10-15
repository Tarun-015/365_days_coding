// Sorting Custom Objects using Comparable
import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Student s) {
        return this.id - s.id; // Sort by ID (ascending)
    }

    public String toString() {
        return id + " - " + name;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Riya"));
        list.add(new Student(1, "Aman"));
        list.add(new Student(2, "Tarun"));

        Collections.sort(list);
        System.out.println("Sorted by ID: " + list);
    }
}


// 🧠 Concept:
// Comparable is used when objects have a natural order (e.g., ID, name, age).
// We override compareTo() inside the class.