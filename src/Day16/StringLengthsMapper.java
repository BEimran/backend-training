package Day16;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class StringLengthsMapper {
    public static List<Integer> mapStringLengths(List<String> strings) {
        Function<String, Integer> stringLengthMapper = String::length;
        return strings.stream().map(stringLengthMapper).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello", "World", "Java");
        System.out.println("Mapped String Lengths: " + mapStringLengths(words));
    }
}