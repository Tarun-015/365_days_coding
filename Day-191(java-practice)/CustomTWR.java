class MyResource implements AutoCloseable {
    public void use() {
        System.out.println("Using MyResource...");
    }
    public void close() {
        System.out.println("MyResource closed!");
    }
}

public class CustomTWR {
    public static void main(String[] args) {
        try (MyResource r = new MyResource()) {
            r.use();
        } // close() auto-called here
    }
}
