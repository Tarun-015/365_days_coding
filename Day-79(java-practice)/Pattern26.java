//Number and Star Mix

public class Pattern26 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0)
                    System.out.print("* ");
                else
                    System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
