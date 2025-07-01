public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40; // This will throw: java.lang.ArrayIndexOutOfBoundsException
    }
}
