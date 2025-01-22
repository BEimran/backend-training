package Day16;

import java.util.function.*;

public class SumBiConsumer {
    public static void printSum(int a, int b) {
        BiConsumer<Integer, Integer> sumPrinter = (num1, num2) ->
                System.out.println("Sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
        sumPrinter.accept(a, b);
    }

    public static void main(String[] args) {
        printSum(3, 5);
    }
}
