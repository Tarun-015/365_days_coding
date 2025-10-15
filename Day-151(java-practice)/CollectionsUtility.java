// Collections Utility Methods (sort, reverse, shuffle, min, max)
import java.util.*;

public class CollectionsUtility {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(45, 12, 78, 34, 23));

        System.out.println("Original List: " + nums);

        Collections.sort(nums);
        System.out.println("Sorted List: " + nums);

        Collections.reverse(nums);
        System.out.println("Reversed List: " + nums);

        Collections.shuffle(nums);
        System.out.println("Shuffled List: " + nums);

        System.out.println("Min Element: " + Collections.min(nums));
        System.out.println("Max Element: " + Collections.max(nums));
    }
}


// 🧠 Concept:
// The Collections class provides static utility methods to operate on collections (like sorting, reversing, min/max finding).