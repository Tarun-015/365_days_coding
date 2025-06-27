//Pascal's Triangle
public class Pattern8 {
     public static void main(String[] args) {
        int n = 5;
        for (int line = 1; line <= n; line++) {
            int num = 1;
            for (int j = 1; j <= n - line; j++)
                System.out.print("  ");
            for (int i = 1; i <= line; i++) {
                System.out.print(num + "   ");
                num = num * (line - i) / i;
            }
            System.out.println();
        }
    }
}
