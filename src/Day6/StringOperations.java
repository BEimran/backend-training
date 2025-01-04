package Day6;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        int comparison = str1.compareTo(str2);
        if (comparison < 0) {
            System.out.println("The first string comes before the second string lexicographically.");
        } else if (comparison > 0) {
            System.out.println("The first string comes after the second string lexicographically.");
        } else {
            System.out.println("Both strings are lexicographically equal.");
        }

        boolean caseSensitiveEquality = str1.equals(str2);
        System.out.println(caseSensitiveEquality);

        boolean caseInsensitiveEquality = str1.equalsIgnoreCase(str2);
        System.out.println(caseInsensitiveEquality);

        String concatenated = str1 + str2;
        System.out.println(concatenated);
    }
}

