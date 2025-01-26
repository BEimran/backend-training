package Day17;

import java.util.Optional;

public class HandleNullWithOptional {
    public static void main(String[] args) {
        String input = null; // Change this to test with non-null values

        Optional<String> optionalInput = Optional.ofNullable(input);
        optionalInput.map(String::toUpperCase)
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("Empty input")
                );
    }
}
