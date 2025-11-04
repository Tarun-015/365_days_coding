// Meta Annotations

// Java provides meta-annotations (annotations used on annotations):

// Meta-Annotation	Description
// @Retention	    Controls lifespan (SOURCE, CLASS, RUNTIME)
// @Target     	    Specifies where annotation can be used (method, field, etc.)
// @Inherited	    Annotation is inherited by subclasses
// @Repeatable	    Same annotation can be applied multiple times

// Example: @Repeatable
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Roles.class)
@interface Role {
    String value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Roles {
    Role[] value();
}

@Role("Admin")
@Role("Editor")
class UserRole {}

public class RepeatableDemo {
    public static void main(String[] args) {
        Role[] roles = UserRole.class.getAnnotationsByType(Role.class);
        for (Role r : roles) {
            System.out.println("Role: " + r.value());
        }
    }
}


//  Output:

// Role: Admin
// Role: Editor