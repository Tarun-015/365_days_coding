// Reading Advanced Annotation Data
import java.lang.reflect.Method;

public class ReadInfo {
    public static void main(String[] args) throws Exception {
        Class<?> cls = AdvancedDemo.class;

        for (Method m : cls.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Info.class)) {
                Info info = m.getAnnotation(Info.class);
                System.out.println("Method: " + m.getName());
                System.out.println(" Author: " + info.author());
                System.out.println(" Date: " + info.date());
                System.out.print(" Reviewers: ");
                for (String r : info.reviewers()) {
                    System.out.print(r + " ");
                }
                System.out.println("\n------------------");
            }
        }
    }
}


//  Output:

// Method: methodOne
//  Author: Unknown
//  Date: 2025-10-08
//  Reviewers: Aman Priya 
// ------------------
// Method: methodTwo
//  Author: Unknown
//  Date: 2025-10-09
//  Reviewers: No reviewers 
// ------------------