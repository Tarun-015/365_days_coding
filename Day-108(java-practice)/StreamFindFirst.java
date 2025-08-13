//  Find first element greater than 50

import java.util.*;
import java.util.stream.*;

public class StreamFindFirst {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 60, 30, 70);
        Optional<Integer> first = nums.stream()
                                      .filter(n -> n > 50)
                                      .findFirst();
        System.out.println(first.orElse(-1));
    }
}
