class Demo {
    static int count = 0;
    int id;

    Demo() {
        count++;
        id = count;
    }

    static void showCount() {
        System.out.println("Total objects: " + count);
    }

    public static void main(String[] args) {
        new Demo();
        new Demo();
        Demo.showCount();
    }
}
