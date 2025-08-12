// Convert list of strings to uppercase

import java.util.*;
import java.util.stream.*;

public class StreamUppercase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("tarun", "raj", "amit");
        List<String> upper = names.stream()
                                  .map(String::toUpperCase)
                                  .collect(Collectors.toList());
        System.out.println(upper);
    }
}
