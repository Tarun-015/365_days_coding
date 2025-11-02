// @Deprecated Annotation

//  Used to mark a method or class as outdated.
// Compiler shows a warning when the method is used.

// File: DeprecatedExample.java
class LegacyCode {
    @Deprecated
    void oldMethod() {
        System.out.println("This method is deprecated");
    }

    void newMethod() {
        System.out.println("This is the new method");
    }
}

public class DeprecatedExample {
    public static void main(String[] args) {
        LegacyCode code = new LegacyCode();
        code.oldMethod();   // Warning: deprecated
        code.newMethod();
    }
}


//  Output:

// This method is deprecated
// This is the new method


//  Compiler warning:

// Note: DeprecatedExample.java uses or overrides a deprecated API.