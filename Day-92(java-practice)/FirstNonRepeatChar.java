import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatChar {
    public static void main(String[] args) {
        String input = "aabbcdeffg";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : input.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating character: " + entry.getKey());
                break;
            }
        }
    }
}
