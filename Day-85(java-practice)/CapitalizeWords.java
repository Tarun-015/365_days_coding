//Capitalize First Letter of Every Word in a Sentence

public class CapitalizeWords {
    public static void main(String[] args) {
        String sentence = "java is awesome";
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                sb.append(Character.toUpperCase(word.charAt(0)))
                  .append(word.substring(1))
                  .append(" ");
            }
        }

        System.out.println("Capitalized: " + sb.toString().trim());
    }
}
