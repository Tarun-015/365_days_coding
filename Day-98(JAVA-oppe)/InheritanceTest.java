import java.util.Scanner;
class Faculty{
   private String name;
   private double salary;
   public Faculty(String name, double salary) {
       this.name = name;
       this.salary = salary;
   }
   public double bonus(float percent){
       return (percent/100.0)*salary;
   }
    public String getDetails() {
        return name + ", " + salary;
    } 
    public String getDetails(float percent ) {
        return getDetails()+ ", bonus = "+bonus(percent);
    }
}
class Hod extends Faculty{
    private String personalAssistant;
    public Hod(String name, double salary, String pa) {
        super(name, salary);
        this.personalAssistant = pa;
    }
    public double bonus(float percent){
        return 0.5*super.bonus(percent);
    }
    public String getDetails() {
        return super.getDetails()+", "+ personalAssistant;
    }
    public String getDetails(float percent ) {
        return getDetails()+", "+bonus(percent);
    } 
}
public class InheritanceTest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Faculty obj1 = new Faculty(sc.next(), sc.nextDouble());
        Faculty obj2 = new Hod(sc.next(), sc.nextDouble(), sc.next());
        System.out.println(obj1.getDetails());
        System.out.println(obj1.getDetails(10));
        System.out.println(obj2.getDetails());
        System.out.println(obj2.getDetails(10));
    }
}