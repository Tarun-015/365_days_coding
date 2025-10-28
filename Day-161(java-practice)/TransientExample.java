// Program 3 — Transient Keyword Example
import java.io.*;

class Account implements Serializable {
    String username;
    transient String password; // Won’t be serialized
    
    Account(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

public class TransientExample {
    public static void main(String[] args) {
        Account acc = new Account("Tarun2004", "mySecretPass");

        // Serialize
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("account.ser"))) {
            oos.writeObject(acc);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("account.ser"))) {
            Account a = (Account) ois.readObject();
            System.out.println("Username: " + a.username);
            System.out.println("Password (transient): " + a.password);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


//  Concept:
// transient skips the variable from being serialized — used for sensitive data.