// Accessing Class Information
public class Student {
    private String name;
    private int age;

    public Student() {}
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}


// Now use reflection to explore this class:

public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("Student");

        System.out.println("Class Name: " + cls.getName());
        System.out.println("Constructors:");
        for (var c : cls.getConstructors()) {
            System.out.println("  " + c);
        }

        System.out.println("\nFields:");
        for (var f : cls.getDeclaredFields()) {
            System.out.println("  " + f);
        }

        System.out.println("\nMethods:");
        for (var m : cls.getDeclaredMethods()) {
            System.out.println("  " + m);
        }
    }
}


//  Output:

// Class Name: Student
// Constructors:
//   public Student()
//   public Student(java.lang.String,int)
// Fields:
//   private java.lang.String Student.name
//   private int Student.age
// Methods:
//   public void Student.showDetails()