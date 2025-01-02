package Day4.Shapes;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum of numbers: " + sum);
    }
}

