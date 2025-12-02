//Static Block Executes Before main()
public class Fact5_StaticBlock {
    static {
        System.out.println("Static Block Executes Before main()");
    }
    public static void main(String[] args) {
        System.out.println("Inside main()");
    }
}


// The JVM loads class → runs static block → then main().