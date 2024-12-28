package Day2;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String []args) {
        Scanner d = new Scanner(System.in);
        int a = d.nextInt(),b = d.nextInt(), c = d.nextInt();
        System.out.println((a>b)?a:(a>c)?a:c);
    }
}
