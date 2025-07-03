//Binary Triangle (Alternating 1 & 0)

public class Pattern23 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int value = (i % 2 == 0) ? 0 : 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(value + " ");
                value = 1 - value; // flip between 1 and 0
            }
            System.out.println();
        }
    }
}
