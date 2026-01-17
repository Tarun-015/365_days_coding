public class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;  // differentiates local & instance variable
        this.age = age;
    }

    void display() {
        System.out.println(name + " is " + age + " years old.");
    }

    public static void main(String[] args) {
        Student s = new Student("Tarun", 20);
        s.display();
    }
}
