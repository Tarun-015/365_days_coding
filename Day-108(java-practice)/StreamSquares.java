// Convert list of integers to their squares

import java.util.*;
import java.util.stream.*;

public class StreamSquares {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        List<Integer> squares = nums.stream()
                                    .map(n -> n * n)
                                    .collect(Collectors.toList());
        System.out.println(squares);
    }
}
