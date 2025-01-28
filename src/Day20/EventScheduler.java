package Day20;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.util.List;

class Event {
    private String name;
    private LocalDateTime dateTime;
    private Duration duration;

    public Event(String name, LocalDateTime dateTime, Duration duration) {
        this.name = name;
        this.dateTime = dateTime;
        this.duration = duration;
    }
    public String getName() {
        return name;
    }
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Duration getDuration() {
        return duration;
    }
    public static Duration calculateDuration(Event event1, Event event2) {
        return Duration.between(event1.getDateTime(), event2.getDateTime());
    }

    @Override
    public String toString() {
        return name + " at " + dateTime + " for " + duration.toHours() + " hours";
    }
}

public class EventScheduler {
    public static void main(String[] args) {
        List<Event> events = List.of(
                new Event("Meeting", LocalDateTime.of(2025, 1, 28, 10, 0), Duration.ofHours(1)),
                new Event("Workshop", LocalDateTime.of(2025, 1, 28, 13, 0), Duration.ofHours(2)),
                new Event("Conference", LocalDateTime.of(2025, 1, 29, 9, 0), Duration.ofHours(3))
        );

        System.out.println("All events:");
        events.forEach(event -> System.out.println(event));
        System.out.println("\nEvents on 2025-01-28:");
        LocalDate targetDate = LocalDate.of(2025, 1, 28);
        events.stream()
                .filter(event -> event.getDateTime().toLocalDate().equals(targetDate))
                .forEach(event -> System.out.println(event.getName()));

        Event meeting = events.get(0);
        Event workshop = events.get(1);
        Duration durationBetween = Event.calculateDuration(meeting, workshop);
        System.out.println("Duration:" + durationBetween.toHours() + "hours");
    }
}

