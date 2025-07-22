import java.util.HashMap;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "balloon";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : map.keySet()) {
            System.out.println(ch + " → " + map.get(ch));
        }
    }
}
