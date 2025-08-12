// Find sum of all elements

import java.util.*;
import java.util.stream.*;

public class StreamSum {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        int sum = nums.stream()
                      .mapToInt(Integer::intValue)
                      .sum();
        System.out.println(sum);
    }
}
