public class StringRotation {
    public static void main(String[] args) {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";

        if (str1.length() == str2.length() && (str1 + str1).contains(str2)) {
            System.out.println("Rotation of each other");
        } else {
            System.out.println("Not rotation");
        }
    }
}
