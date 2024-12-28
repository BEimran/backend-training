package Day1;

import java.util.Scanner;

public class LogicalRelational {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        boolean isGreater = num1 > num2;
        boolean areBothPositive = num1 > 0 && num2 > 0;

        System.out.println("Is the first number greater than the second? " + isGreater);
        System.out.println("Are both numbers positive? " + areBothPositive);
    }
}

