// Program 2: Enum with Fields and Methods

// Purpose: Shows enum with properties, constructors, and getter methods.

// File: EnumWithProperties.java
enum DayType {
    MONDAY("Weekday"), FRIDAY("Weekday"), SATURDAY("Weekend"), SUNDAY("Weekend");

    private String type;
    DayType(String type) { this.type = type; }
    public String getType() { return type; }
}

public class EnumWithProperties {
    public static void main(String[] args) {
        for(DayType d : DayType.values()) {
            System.out.println(d + " is a " + d.getType());
        }
    }
}