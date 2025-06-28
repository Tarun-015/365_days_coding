//0-1 Triangle

public class Pattern9 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int value = (i + j) % 2;
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
