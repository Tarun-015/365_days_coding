// Find max element in a list

import java.util.*;
import java.util.stream.*;

public class StreamMax {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 40, 30, 50, 20);
        Optional<Integer> max = nums.stream()
                                    .max(Integer::compareTo);
        System.out.println(max.orElse(-1));
    }
}
