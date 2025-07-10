//Number Palindrome Pyramid

public class Pattern28 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int s = 1; s <= n - i; s++)
                System.out.print("  ");

            // Descending numbers
            for (int j = i; j >= 1; j--)
                System.out.print(j + " ");

            // Ascending numbers
            for (int j = 2; j <= i; j++)
                System.out.print(j + " ");

            System.out.println();
        }
    }
}
