// Program 2 — Basic Deserialization
import java.io.*;

class DeserializeDemo {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student s = (Student) ois.readObject();
            System.out.println("✅ Object deserialized successfully!");
            System.out.println("ID: " + s.id + ", Name: " + s.name);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


// Concept:
// readObject() reads binary data and reconstructs the original Java object.