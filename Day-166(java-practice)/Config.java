// Add Another Annotation for Configuration

// Let’s simulate how frameworks like Spring Boot use multiple annotations.

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Config {
    String appName();
}


// Use it on a class:

@Config(appName = "TarunFramework")
public class AppConfig {
    public void loadConfig() {
        System.out.println("App Configuration Loaded Successfully!");
    }
}


// And reflectively load it:

public class ConfigLoader {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("AppConfig");

        if (cls.isAnnotationPresent(Config.class)) {
            Config cfg = cls.getAnnotation(Config.class);
            System.out.println("Application: " + cfg.appName());
            Object obj = cls.getDeclaredConstructor().newInstance();
            cls.getMethod("loadConfig").invoke(obj);
        }
    }
}


//  Output:

// Application: TarunFramework
// App Configuration Loaded Successfully!