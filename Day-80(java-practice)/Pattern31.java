//Hollow Full Pyramid

public class Pattern31 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            // Stars with hollow logic
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}
