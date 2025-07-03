//Right Pascal's Triangle

public class Pattern24 {
    public static void main(String[] args) {
        int n = 5;

        // Upper triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }

        // Lower triangle
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
