package Day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxElementInArrayList {

    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers separated by space (e.g., 15 22 8 42 17):");
        String[] input = d.nextLine().split(" ");
        for (String num : input) {
            numbers.add(Integer.parseInt(num));
        }

        int maxElement = Collections.max(numbers);

        System.out.println("Maximum Element: " + maxElement);

    }
}
