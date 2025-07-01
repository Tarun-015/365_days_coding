public class OutOfMemory {
    public static void main(String[] args) {
        int[] arr = new int[2000000000]; //  This will throw: java.lang.OutOfMemoryError
    }
}
