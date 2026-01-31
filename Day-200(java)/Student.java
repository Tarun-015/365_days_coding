public class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student[ID=" + id + ", Name=" + name + "]";
    }

    public static void main(String[] args) {
        Student s = new Student(101, "Tarun");
        System.out.println(s); // calls toString() automatically
    }
}