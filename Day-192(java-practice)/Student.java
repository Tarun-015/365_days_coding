class Student {
    String name;
    int age;

    Student() {
        System.out.println("Default Constructor");
    }

    Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("Parameterized Constructor: " + name + " " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Tarun", 20);
    }
}
