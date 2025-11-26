try (TestRes r = new TestRes()) {
    throw new RuntimeException("Main Exception");
} catch (Exception e) {
    System.out.println("Caught: " + e);
    for (Throwable t : e.getSuppressed())
        System.out.println("Suppressed: " + t);
}

// Output:

// Copy code
// Caught: java.lang.RuntimeException: Main Exception
// Suppressed: java.lang.RuntimeException: Close Exception