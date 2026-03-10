// Method 1: Using Arrays.asList()
import java.util.*;

public class ArrayToArrayList {
    public static void main(String[] args) {

        String arr[] = {"Ram", "Shyam", "Mohan"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println(list);
    }
}


// Method 2: Using Loop

class ArrayToListLoop {
    public static void main(String[] args) {

        int arr[] = {10,20,30};

        ArrayList<Integer> list = new ArrayList<>();

        for(int i : arr){
            list.add(i);
        }

        System.out.println(list);
    }
}