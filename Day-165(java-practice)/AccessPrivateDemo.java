// Modifying Private Fields (setAccessible)
public class AccessPrivateDemo {
    public static void main(String[] args) throws Exception {
        Student s = new Student("Ravi", 21);

        Class<?> cls = s.getClass();
        var field = cls.getDeclaredField("name");
        field.setAccessible(true);  // bypass private access
        field.set(s, "Tarun");

        s.showDetails();  // prints updated name
    }
}


//  Output:

// Name: Tarun, Age: 21
