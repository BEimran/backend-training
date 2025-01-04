package Day6;

import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());

            int result = num1 / num2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        } finally {
            scanner.close();
        }
    }
}

