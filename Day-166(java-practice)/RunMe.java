// Define Custom Annotations

// Create an annotation that marks methods to run automatically (like @Test in JUnit).

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RunMe {
    String value() default "Executing method";
}


// @Retention(RetentionPolicy.RUNTIME) → makes it available during runtime
//  @Target(ElementType.METHOD) → applies only to methods