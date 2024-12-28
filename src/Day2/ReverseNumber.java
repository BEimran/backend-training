package Day2;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int input = d.nextInt();
        int rev=0;
        while (input != 0) {
            int rem = input % 10;
            rev = (rev * 10) + rem;
            input /= 10;
        }
        System.out.println(rev);
    }
}
