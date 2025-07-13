public class DigitReverseSeries {

    public static void generate(int terms) {
        for (int i = 10; i < 10 + terms; i++) {
            System.out.print(i + " " + reverse(i) + " ");
        }
        System.out.println();
    }

    private static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }
}
