// Reflection + Annotation Combo Example
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RunNow {
    int times() default 1;
}

class Task {
    @RunNow(times = 3)
    public void sayHello() {
        System.out.println("Hello Tarun!");
    }
}

public class AnnotationReflectionDemo {
    public static void main(String[] args) throws Exception {
        Task task = new Task();
        Method[] methods = task.getClass().getDeclaredMethods();

        for (Method m : methods) {
            if (m.isAnnotationPresent(RunNow.class)) {
                RunNow r = m.getAnnotation(RunNow.class);
                for (int i = 0; i < r.times(); i++) {
                    m.invoke(task);
                }
            }
        }
    }
}


//  Output:

// Hello Tarun!
// Hello Tarun!
// Hello Tarun!