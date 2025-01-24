package Day17;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class CurrentDateTimeSupplier {
    public static void main(String[] args) {
        Supplier<LocalDateTime> currentDateTimeSupplier = () -> LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTimeSupplier.get());
    }
}


