//Reverse Each Word in a Sentence

public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(new StringBuilder(word).reverse().toString()).append(" ");
        }

        System.out.println("Reversed Words: " + result.toString().trim());
    }
}
