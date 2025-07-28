//  Find Longest Word in a Sentence

public class LongestWord {
    public static void main(String[] args) {
        String sentence = "Artificial intelligence is revolutionizing the world";
        String[] words = sentence.split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest word: " + longest);
    }
}
