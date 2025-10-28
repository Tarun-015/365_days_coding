// Program 4 — Serializing Multiple Objects
import java.io.*;
import java.util.ArrayList;

class Employee implements Serializable {
    int id;
    String name;
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class MultiObjectSerialize {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Amit"));
        employees.add(new Employee(2, "Sneha"));
        employees.add(new Employee(3, "Tarun"));

        // Serialize multiple objects
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.ser"))) {
            oos.writeObject(employees);
            System.out.println("✅ Employee list serialized successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.ser"))) {
            ArrayList<Employee> list = (ArrayList<Employee>) ois.readObject();
            System.out.println("\nEmployee list after deserialization:");
            for (Employee emp : list) {
                System.out.println(emp.id + " - " + emp.name);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
//  Concept:
// You can serialize an entire collection (like ArrayList<Employee>) in one go.