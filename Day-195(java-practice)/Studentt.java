public class Studentt implements Cloneable {
    int id;
    String name;

    Studentt(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws Exception {
        Studentt s1 = new Studentt(1, "Tarun");
        Studentt s2 = (Student) s1.clone();

        System.out.println(s1.name + " - " + s1.id);
        System.out.println(s2.name + " - " + s2.id);
    }
}
