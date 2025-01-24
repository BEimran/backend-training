package Day17;

import java.util.function.UnaryOperator;

public class StringToUppercase {
    public static void main(String[] args) {
        UnaryOperator<String> toUpperCaseOperator = String::toUpperCase;

        String inputString = "hello world";
        System.out.println("Original String: " + inputString);
        System.out.println("Uppercase String: " + toUpperCaseOperator.apply(inputString));
    }
}

