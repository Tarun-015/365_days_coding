public class ArrayStoreExceptionDemo {
    public static void main(String[] args) {
        Number[] arr = new Integer[5];
        arr[0] = 10;      // OK
        arr[1] = 10.5f;   // Throws ArrayStoreException (Float is not Integer)
    }
}
