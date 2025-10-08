// Difference Between Array and ArrayList
import java.util.*;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        // Normal Array
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        System.out.println("Array Elements: " + Arrays.toString(arr));

        // ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40); // Dynamic resizing
        System.out.println("ArrayList Elements: " + list);
    }
}
