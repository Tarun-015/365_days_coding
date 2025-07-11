//Hourglass Star Pattern

public class Pattern29 {
    public static void main(String[] args) {
        int n = 5;

        // Upper Half
        for (int i = n; i >= 1; i--) {
            for (int s = 0; s < n - i; s++)
                System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++)
                System.out.print("*");
            System.out.println();
        }

        // Lower Half
        for (int i = 2; i <= n; i++) {
            for (int s = 0; s < n - i; s++)
                System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
