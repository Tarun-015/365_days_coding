public class OuterClass {
    static class Nested {
        void show() {
            System.out.println("Inside static nested class");
        }
    }

    public static void main(String[] args) {
        OuterClass.Nested n = new OuterClass.Nested();
        n.show();
    }
}