package Day19;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130);

        numbers.parallelStream()
                .filter(n -> n > 50)
                .map(n -> n * n)
                .limit(10)
                .forEach(System.out::println);
    }
}

