class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

public class ObjectClassDemo {

    public static void main(String args[]) {

        Student s1 = new Student(1, "Ram");

        System.out.println(s1);   // calls toString()
    }
}