package Day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArrayList {

    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        String[] input = d.nextLine().split(" ");
        for (String num : input) {
            numbers.add(Integer.parseInt(num));
        }

        System.out.println("Original List: " + numbers);
        Collections.reverse(numbers);
        System.out.println("Reversed List: " + numbers);

    }
}
