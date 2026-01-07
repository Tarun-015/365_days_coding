class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}
class TestCustom {
    static void validate(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("Not eligible");
        else
            System.out.println("Welcome!");
    }
    public static void main(String[] args) {
        try {
            validate(15);
        } catch (InvalidAgeException e) {
            System.out.println("Caught: " + e);
        }
    }
}
