public class ReverseFactorial {

    public static void generate(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;

        int num = fact;
        for (int i = n; i >= 1; i--) {
            System.out.print(num + " ");
            num /= i;
        }
        System.out.println();
    }
}
