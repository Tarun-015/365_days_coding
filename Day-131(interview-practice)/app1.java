//Method 1: For Loop (backward index)
import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}


//Method 2: While Loop
import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D");

        int i = list.size() - 1;
        while (i >= 0) {
            System.out.print(list.get(i) + " ");
            i--;
        }
    }
}


//Method 3: Recursion
import java.util.*;

class ReverseList {
    static void printReverse(List<Integer> list, int index) {
        if (index < 0) return;
        System.out.print(list.get(index) + " ");
        printReverse(list, index - 1);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        printReverse(list, list.size() - 1);
    }
}


//Method 4: In-place Swap (Reverse List without extra memory)
import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        int left = 0, right = list.size() - 1;
        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }

        // Print reversed list
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}


