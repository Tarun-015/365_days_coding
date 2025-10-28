// Program 1 — Basic Serialization
import java.io.*;

// Step 1: Class must implement Serializable
class Student implements Serializable {
    int id;
    String name;
    
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializeDemo {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Tarun");
        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            oos.writeObject(s1);
            System.out.println("✅ Object serialized successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


//  Concept:
// writeObject() saves the state of the Student object into a .ser file.