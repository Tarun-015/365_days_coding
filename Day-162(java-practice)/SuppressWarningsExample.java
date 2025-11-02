// @SuppressWarnings Annotation

//  Used to hide compiler warnings (like unused variables, deprecations, etc).

// File: SuppressWarningsExample.java
public class SuppressWarningsExample {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        LegacyCode code = new LegacyCode();
        code.oldMethod();   // No warning shown
    }
}


//  Output:

// This method is deprecated


// Explanation:

// The compiler warning from the previous example is now suppressed.

// Can also use multiple values:
// @SuppressWarnings({"unchecked", "deprecation"})