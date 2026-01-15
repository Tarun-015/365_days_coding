class Person {
    Person() {
        System.out.println("Person constructor");
    }
}

class Student extends Person {
    Student() {
        this("Tarun"); // calls parameterized constructor
        System.out.println("Default Student constructor");
    }

    Student(String name) {
        super(); // calls parent (Person) constructor
        System.out.println("Parameterized Student constructor: " + name);
    }

    public static void main(String[] args) {
        new Student();
    }
}
