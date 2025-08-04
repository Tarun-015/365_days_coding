// Question 2: Prevent Negative Values
// Modify the setGpa() method in the Student class so that GPA can’t be negative or more than 10.

// // If invalid GPA is passed, ignore it and print "Invalid GPA".

public class Stud {
    private float gpa;

    public void setGpa(float gpa) {
        if (gpa >= 0 && gpa <= 10) {
            this.gpa = gpa;
        } else {
            System.out.println("Invalid GPA");
        }
    }

    public float getGpa() {
        return gpa;
    }

    public static void main(String[] args) {
        Stud s = new Stud();
        s.setGpa(-3.4f);   // Invalid
        s.setGpa(11f);     // Invalid
        s.setGpa(8.4f);    // Valid
        System.out.println(s.getGpa());
    }
}
