//Count Each Character Frequency in String

import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "banana";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character Frequencies:");
        for (char c : map.keySet()) {
            System.out.println(c + ": " + map.get(c));
        }
    }
}
