public class School {
    
    private class Student {
        String name;

        Student(String name) {
            this.name = name;
        }

        void display() {
            System.out.println("Student name: " + name);
        }
    }

    public void createStudent() {
        Student s = new Student("Tarun");
        s.display();
    }

    public class Main {
    public static void main(String[] args) {
        School school = new School();
        school.createStudent(); // Output: Student name: Tarun
    }
}

}


