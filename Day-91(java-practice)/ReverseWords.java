public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "I love coding";
        String[] words = sentence.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        System.out.println("Reversed Sentence: " + reversed.toString().trim());
    }
}
