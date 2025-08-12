// Sort a list in descending order

import java.util.*;
import java.util.stream.*;

public class StreamSortDescending {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 1, 4, 2, 3);
        List<Integer> sorted = nums.stream()
                                   .sorted(Comparator.reverseOrder())
                                   .collect(Collectors.toList());
        System.out.println(sorted);
    }
}
