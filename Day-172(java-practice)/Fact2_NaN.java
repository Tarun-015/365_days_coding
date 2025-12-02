// NaN (Not a Number) is never equal to itself
public class Fact2_NaN {
    public static void main(String[] args) {
        double d = Double.NaN;
        System.out.println(d == d); // false
    }
}


//  IEEE floating-point rule: NaN ≠ NaN 😅