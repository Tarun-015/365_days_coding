// Find distinct elements

import java.util.*;
import java.util.stream.*;

public class StreamDistinct {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 3, 4);
        List<Integer> unique = nums.stream()
                                   .distinct()
                                   .collect(Collectors.toList());
        System.out.println(unique);
    }
}
