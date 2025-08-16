// Address.java
public class Address {
    String city;
    String state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return city + ", " + state;
    }
}

// Student.java
public class Student {
    int id;
    String name;
    Address[] addresses;  // Has-A relation (one-to-many)

    public Student(int id, String name, Address[] addresses) {
        this.id = id;
        this.name = name;
        this.addresses = addresses;
    }

    public void showDetails() {
        System.out.println("ID: " + id + ", Name: " + name);
        System.out.println("Addresses: ");
        for (Address a : addresses) {
            System.out.println(" - " + a);
        }
    }

    public static void main(String[] args) {
        Address[] addrList = {
            new Address("Delhi", "Delhi"),
            new Address("Mumbai", "Maharashtra"),
            new Address("Chennai", "Tamil Nadu")
        };

        Student s2 = new Student(102, "Aarav", addrList);
        s2.showDetails();
    }
}
