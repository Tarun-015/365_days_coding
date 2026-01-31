class Address {
    String city, state;

    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }
}

public class Employee {
    int id;
    String name;
    Address address; // HAS-A relationship

    Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(id + " " + name + " " + address.city + ", " + address.state);
    }

    public static void main(String[] args) {
        Address addr = new Address("Bengaluru", "Karnataka");
        Employee e = new Employee(1, "Tarun", addr);
        e.display();
    }
}