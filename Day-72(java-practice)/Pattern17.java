//Mirror Right Triangle (Right-Aligned)

public class Pattern17 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");
            // Stars
            for (int k = 1; k <= i; k++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
