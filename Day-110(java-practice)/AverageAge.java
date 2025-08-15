//Find the Average Age of People Above 18

import java.util.*;
import java.util.stream.*;

public class AverageAge {
    public static void main(String[] args) {
        List<Integer> ages = Arrays.asList(12, 19, 22, 15, 30, 17, 40);

        double avg = ages.stream()
                         .filter(age -> age > 18)
                         .mapToInt(Integer::intValue)
                         .average()
                         .orElse(0);

        System.out.println("Average age (above 18): " + avg);
    }
}


// o/p ;
// Average age (above 18): 27.75