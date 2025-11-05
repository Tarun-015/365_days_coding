// Invoking Methods Using Reflection
public class MethodInvokeDemo {
    public static void main(String[] args) throws Exception {
        Student s = new Student("Kiran", 20);

        Class<?> cls = s.getClass();
        var method = cls.getDeclaredMethod("showDetails");
        method.invoke(s);
    }
}


//  Output:

// Name: Kiran, Age: 20