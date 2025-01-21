package Day15;

import java.util.*;
import java.util.stream.Collectors;

public class NameTransformer {

    public static List<String> transformNames(List<String> names) {
        return names.stream()
                .map(name -> "Student: " + name.toUpperCase())
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<String> studentNames = Arrays.asList("Alice", "Bob", "Charlie", "Diana");
        List<String> transformedNames = transformNames(studentNames);
        transformedNames.forEach(System.out::println);
    }
}
