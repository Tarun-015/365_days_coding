// Address.java
public class Address {
    String city;
    String state;
    String country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    @Override
    public String toString() {
        return city + ", " + state + ", " + country;
    }
}

// Student.java
public class Student {
    int id;
    String name;
    Address address;  // Has-A relation (one-to-one)

    public Student(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void showDetails() {
        System.out.println("ID: " + id + ", Name: " + name);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Address addr = new Address("Bengaluru", "Karnataka", "India");
        Student s1 = new Student(101, "Tarun", addr);
        s1.showDetails();
    }
}


// o/p:
// ID: 101, Name: Tarun
// Address: Bengaluru, Karnataka, India
