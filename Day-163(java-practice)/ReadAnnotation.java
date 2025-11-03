// Reading Annotation Info at Runtime (Intro Reflection)
// File: ReadAnnotation.java
import java.lang.reflect.Method;

public class ReadAnnotation {
    public static void main(String[] args) throws Exception {
        Class<?> cls = DemoAnnotation.class;
        Method method = cls.getMethod("display");

        if (method.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation ann = method.getAnnotation(MyAnnotation.class);
            System.out.println("Author: " + ann.author());
            System.out.println("Date: " + ann.date());
        }
    }
}


//  Output:

// Author: Tarun Chaudhary
// Date: 2025-10-08
