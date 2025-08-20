// Create a class Student with the following fields:

// int id

// String name

// String course

// Write a program to serialize an object of Student into a file named student.ser.

// Then deserialize the object back from the file and display the student details.



import java.io.*;

// Student class must implement Serializable
class Student implements Serializable {
    private static final long serialVersionUID = 1L; // Recommended for Serializable classes
    
    int id;
    String name;
    String course;

    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Course: " + course);
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        // Serialization
        try {
            Student s1 = new Student(101, "Tarun", "Data Science");
            
            // Writing object to file
            FileOutputStream fos = new FileOutputStream("student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.close();
            fos.close();
            
            System.out.println("✅ Student object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try {
            FileInputStream fis = new FileInputStream("student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s2 = (Student) ois.readObject();
            ois.close();
            fis.close();
            
            System.out.println("✅ Student object deserialized successfully.");
            s2.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


// o/p :
// Student object serialized successfully.
// Student object deserialized successfully.
// ID: 101, Name: Tarun, Course: Data Science
