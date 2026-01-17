class Display {
    void show(int a) {
        System.out.println("Integer: " + a);
    }
    void show(String s) {
        System.out.println("String: " + s);
    }
}

public class Child extends Display {
    @Override
    void show(String s) {
        System.out.println("Child String: " + s);
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.show(10);        // Overloaded method (from parent)
        obj.show("Tarun");   // Overridden method (child version)
    }
}
