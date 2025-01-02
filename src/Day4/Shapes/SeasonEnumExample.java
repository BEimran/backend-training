package Day4.Shapes;

enum Season {
    WINTER, SPRING, SUMMER, FALL;

    public double getAverageTemperature() {
        return switch (this) {
            case WINTER -> 0.0;
            case SPRING -> 15.0;
            case SUMMER -> 30.0;
            case FALL -> 10.0;
        };
    }
}

public class SeasonEnumExample {
    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.println(season + " average temperature: " + season.getAverageTemperature() + "°C");
        }
    }
}
