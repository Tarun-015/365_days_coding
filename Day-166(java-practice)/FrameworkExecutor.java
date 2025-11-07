// Build Framework Logic Using Reflection

// This class will scan and run all methods annotated with @RunMe.

import java.lang.reflect.Method;

public class FrameworkExecutor {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("TaskRunner");
        Object obj = cls.getDeclaredConstructor().newInstance();

        for (Method method : cls.getDeclaredMethods()) {
            if (method.isAnnotationPresent(RunMe.class)) {
                RunMe rm = method.getAnnotation(RunMe.class);
                System.out.println(">>> " + rm.value());
                method.invoke(obj);
            }
        }
    }
}


//  Output:

// >>> Task 2 started
// Running Task 2...
// >>> Task 1 started
// Running Task 1...