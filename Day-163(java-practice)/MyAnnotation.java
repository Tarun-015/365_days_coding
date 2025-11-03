// Basic Custom Annotation Example
// File: MyAnnotation.java
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // makes it available at runtime
@Target(ElementType.METHOD)         // applicable only on methods
public @interface MyAnnotation {
    String author();                // annotation element
    String date();
}

// Explanation:

// @Retention(RetentionPolicy.RUNTIME) → Annotation info is available at runtime.

// @Target(ElementType.METHOD) → Annotation can only be applied to methods.

// String author() and String date() → act like parameters for annotation.