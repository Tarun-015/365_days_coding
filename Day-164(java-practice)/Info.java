// Adding Default Values

// You can provide default values for annotation elements using the default keyword.

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Info {
    String author() default "Unknown";
    String date();
    String[] reviewers() default {"No reviewers"};
}


//  Now, if we don’t provide all parameters, defaults are used.