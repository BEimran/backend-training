package Day4.Shapes;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class BasicEnumExample {
    public static void main(String[] args) {
        Day today = Day.SATURDAY;

        switch (today) {
            case SATURDAY, SUNDAY -> System.out.println("It's a weekend");
            default -> System.out.println("It's a weekday");
        }
    }
}

