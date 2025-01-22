package Day16;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class FilterStringsByLetter {
    public static List<String> filterStringsStartingWith(List<String> strings, char letter) {
        Predicate<String> startsWithLetter = str -> str.startsWith(String.valueOf(letter));
        return strings.stream().filter(startsWithLetter).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Banana", "Avocado", "Cherry");
        System.out.println("Filtered Strings Starting with 'A': " + filterStringsStartingWith(strings, 'A'));
    }
}
