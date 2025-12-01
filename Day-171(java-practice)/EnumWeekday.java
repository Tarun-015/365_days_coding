// Program 1: Enum Basics – Weekday Checker

// Purpose: Demonstrates basic enum usage and switch-case on enum.

// File: EnumWeekday.java
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumWeekday {
    public static void main(String[] args) {
        Day today = Day.FRIDAY;

        switch(today) {
            case MONDAY -> System.out.println("Start of week!");
            case FRIDAY -> System.out.println("Almost weekend!");
            case SATURDAY, SUNDAY -> System.out.println("Weekend!");
            default -> System.out.println("Midweek");
        }
    }
}