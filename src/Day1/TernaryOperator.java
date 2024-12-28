package Day1;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is: " + result);
    }
}

