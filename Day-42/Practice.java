import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("35");
        BigInteger num2 = new BigInteger("40");

        Scanner sc=new Scanner(System.in);
        String n1= sc.next();
        String n2 = sc.next();

        BigInteger add = num1.add(num2);
        System.out.println(add); 

        BigDecimal num3=new BigDecimal(n1);
        BigDecimal num4=new BigDecimal(n2);
        

        BigDecimal addd = num3.add(num4);
        BigDecimal sub = num3.subtract(num4);
        BigDecimal multiply = num3.multiply(num4);
        BigDecimal div = num3.divide(num4);
        System.out.println(addd.toString());
        System.out.println(sub);
        System.out.println(multiply);
        System.out.println(div);

       
        sc.close();
    }
}
