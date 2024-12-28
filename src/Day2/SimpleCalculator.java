package Day2;

import java.util.Scanner;

    public class SimpleCalculator {
        public static void main(String[] args) {
            Scanner d = new Scanner(System.in);
            System.out.println("Enter the first number:");
            double num1 = d.nextDouble();

            System.out.println("Enter the operator (+, -, *, /):");
            char operator = d.next().charAt(0);

            System.out.println("Enter the second number:");
            double num2 = d.nextDouble();
            double result;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
                    break;
            }
        }
    }

