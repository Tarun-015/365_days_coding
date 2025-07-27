public class VowelConsonantCounter {
    public static void main(String[] args) {
        String input = "Hello World";
        int vowels = 0, consonants = 0;

        input = input.toLowerCase().replaceAll("[^a-z]", "");

        for (char ch : input.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1)
                vowels++;
            else
                consonants++;
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
