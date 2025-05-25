// Complete the definition of the given class by defining appropriate constructors and member functions such that it is in coherence with the given main method and produce the required output.
import java.util.*;

class Employee
{
    String eid;
    String ename;
    String eprojects[];
 //Define all the required methods here
     public Employee(String id, String name, String[] projects) {
            this.eid = id;
            this.ename = name;
            this.eprojects = new String[projects.length];
            for (int i = 0; i < projects.length; i++) {
                this.eprojects[i] = projects[i];
            }
        }
    
        // Copy constructor
        public Employee(Employee e) {
            this.eid = e.eid;
            this.ename = e.ename;
            this.eprojects = new String[e.eprojects.length];
            for (int i = 0; i < e.eprojects.length; i++) {
                this.eprojects[i] = e.eprojects[i];
            }
        }
        
            public void display() {
        System.out.println("id:" + this.eid);
        System.out.println("name:" + this.ename);
        System.out.print("projects:\n");
        for (int i = 0; i < eprojects.length; i++) {
            System.out.print(eprojects[i]);
            System.out.print(":");
        }
        System.out.println();
    }
public void mutator()
    {
        this.ename = "Mr "+ this.ename;
        this.eprojects[0] = null;
    }
    
}
public class emp
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
    	   String project[] = {"P001","P002","P003"};
        //Enter the id of employee
        String id = s.nextLine();
        //Enter the name of employee
        String name = s.nextLine();
        
        Employee e1 = new Employee(id,name,project);
        Employee e2 = new Employee(e1); 
        //The copy constructor must copy all the data members. 
       
        e1.mutator();
        
        e2.display();
        s.close();
    }
}