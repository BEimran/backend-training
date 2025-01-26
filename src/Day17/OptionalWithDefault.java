package Day17;

import java.util.Optional;

public class OptionalWithDefault {
    public static void main(String[] args) {
        String name = null; // Change this to test with non-null values

        String result = Optional.ofNullable(name)
                .orElse("Guest");
        System.out.println("Hello, " + result + "!");
    }
}

