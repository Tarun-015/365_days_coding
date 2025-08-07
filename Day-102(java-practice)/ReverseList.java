// Create an ArrayList, add 5 numbers, and print them in reverse order.

import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);

        Collections.reverse(nums);
        System.out.println("Reversed List: " + nums);
    }
}
