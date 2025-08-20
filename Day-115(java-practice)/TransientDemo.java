// Question 2:

// Demonstrate the use of the transient keyword in serialization.
// Create a User class with username and password fields, where password should not be serialized.

import java.io.*;

// User class implementing Serializable
class User implements Serializable {
    private static final long serialVersionUID = 1L;

    String username;
    transient String password; // transient => will not be serialized

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void display() {
        System.out.println("Username: " + username + ", Password: " + password);
    }
}

public class TransientDemo {
    public static void main(String[] args) {
        // Serialization
        try {
            User u1 = new User("tarun_ds", "secret123");

            FileOutputStream fos = new FileOutputStream("user.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(u1);
            oos.close();
            fos.close();

            System.out.println("✅ User object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try {
            FileInputStream fis = new FileInputStream("user.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            User u2 = (User) ois.readObject();
            ois.close();
            fis.close();

            System.out.println("✅ User object deserialized successfully.");
            u2.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

// o/p :
// User object serialized successfully.
// User object deserialized successfully.
// Username: tarun_ds, Password: null

