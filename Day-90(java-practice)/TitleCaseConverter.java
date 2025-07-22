public class TitleCaseConverter {
    public static void main(String[] args) {
        String str = "java is awesome";
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                sb.append(Character.toUpperCase(word.charAt(0)))
                  .append(word.substring(1)).append(" ");
            }
        }

        System.out.println("Title Case: " + sb.toString().trim());
    }
}
