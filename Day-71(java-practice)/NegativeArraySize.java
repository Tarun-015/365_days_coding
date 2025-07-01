
public class NegativeArraySize {
    public static void main(String[] args) {
        int size = -5;
        int[] arr = new int[size];  // This will throw: java.lang.NegativeArraySizeException
    }
}
