// Example: Java 9 Enhanced Syntax
Res1 r1 = new Res1();
Res2 r2 = new Res2();

try (r1; r2) {  // No need to redeclare or reinitialize
    System.out.println("Using pre-declared resources");
}


// Output:

// Using pre-declared resources
// Res2 closed
// Res1 closed