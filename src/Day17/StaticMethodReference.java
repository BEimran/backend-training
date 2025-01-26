package Day17;

import java.util.Arrays;
import java.util.List;

public class StaticMethodReference {
    public static void main(String[] args) {
        List<Double> numbers = Arrays.asList(4.0, 16.0, 25.0, 36.0);

        numbers.forEach(num -> System.out.println("Square root of " + num + " is " + Math.sqrt(num)));
    }
}

