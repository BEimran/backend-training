package Day1;

import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a float value: ");
        float floatValue = scanner.nextFloat();

        int intValue = (int) floatValue;
        System.out.println("Float value: " + floatValue);
        System.out.println("Converted int value: " + intValue);
    }
}

