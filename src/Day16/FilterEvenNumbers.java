package Day16;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class FilterEvenNumbers {
    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        Predicate<Integer> isEven = num -> num % 2 == 0;
        return numbers.stream().filter(isEven).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 45, 22, 35, 60);
        System.out.println("Filtered Even Numbers: " + filterEvenNumbers(numbers));
    }
}
