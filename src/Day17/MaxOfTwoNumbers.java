package Day17;

import java.util.function.BinaryOperator;

public class MaxOfTwoNumbers {
    public static void main(String[] args) {
        BinaryOperator<Integer> maxOperator = Integer::max;

        int num1 = 45;
        int num2 = 78;
        System.out.println("Max of " + num1 + " and " + num2 + ": " + maxOperator.apply(num1, num2));
    }
}
