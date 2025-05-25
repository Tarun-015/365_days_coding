//Complete the definition of the given class by defining appropriate constructors and member functions such that it is in coherence with the given main method and produce the required output.
import java.util.Scanner;

class Employee{
	    String ename;
	    String eid;
	    String edept;
	    
	    public Employee(){
		        ename = "guest";
	    }
     public Employee(String name, String id, String dept) {
        this.ename = name;
        this.eid = id;
        this.edept = dept;
    }

    // Method to copy department from another employee
    public void copyDept(Employee e) {
        this.edept = e.edept;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("ename : " + ename);
        System.out.println("eid : " + eid);
        System.out.println("edept : " + edept);
    }

}
public class FClass 
{
	    public static void main(String args[]) 
	    {
		        Scanner s = new Scanner(System.in);
		        Employee e1 = new Employee();
		
		        //Enter name of the employee
		        String name = s.nextLine();
		
		        //Enter id of the employee
		        String id = s.nextLine();
		
		        //Enter department of the employee
		        String dept = s.nextLine();
		
		        Employee e2 = new Employee(name,id,dept);
		
		        e1.copyDept(e2); 
		        //Copies the department name of e2 into e1's department name.
		
		        e1.displayDetails();
				s.close();
	    }
}