// Address.java
public class Address {
    String city, state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public String toString() {
        return city + ", " + state;
    }
}

// Student.java
public class Student {
    int id;
    String name;
    Address address;  // Many-to-One association

    public Student(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Address addr = new Address("Bengaluru", "Karnataka");

        Student s1 = new Student(101, "Tarun", addr);
        Student s2 = new Student(102, "Aarav", addr);

        s1.display();
        s2.display();
    }
}

// o/p :
// ID: 101, Name: Tarun
// Address: Bengaluru, Karnataka
// ID: 102, Name: Aarav
// Address: Bengaluru, Karnataka
