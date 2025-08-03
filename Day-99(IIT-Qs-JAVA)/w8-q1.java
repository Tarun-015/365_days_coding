// The program stores a list of Employee objects, each of which has name, department and salary as instance variables. A user can query the list to find the Employees who belong to a specific department and have salary greater than or equal to the input salary. Complete the program as specified.
// Define a class Employee as follows:
// Add the instance variables to represent name, department and salary
// Implement the required constructor(s) and accessors.
// Override the method toString() so that the format of the output is in accordance with those in the test cases. 

// Define a function query that takes a list of employees, a department and a salary as input. It returns a stream comprising the Employee objects that have the same department and have salary greater and equal to the given salary.


import java.util.*;
import java.util.stream.*;
//define class Employee
class Employee {
    private String name;
    private String department;
    private double salary;

    // Constructor
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Accessors
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    // Override toString method
    @Override
    public String toString() {
        return name + " : " + department + " : " + (int)salary;
    }
}

class FClass{
    //define method query
    public static Stream<Employee> query(List<Employee> list, String dept, double minSalary) {
        return list.stream()
                .filter(e -> e.getDepartment().equals(dept) && e.getSalary() >= minSalary);
    }

    
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var eList = new ArrayList<Employee>();
        eList.add(new Employee("Jack", "HR", 30000));
        eList.add(new Employee("Aria", "HR", 40000));
        eList.add(new Employee("Nora", "IT", 50000));
        eList.add(new Employee("Bella", "IT", 60000));
        eList.add(new Employee("Jacob", "IT", 70000));
        eList.add(new Employee("James", "HR", 80000));
        String d = sc.next();       //read department
        double s = sc.nextInt();    //read salary
		
        var st = query(eList, d, s);
        st.forEach(n -> System.out.println(n + " "));
    }
}