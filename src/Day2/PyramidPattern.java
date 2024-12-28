package Day2;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int input = d.nextInt();
        for (int i = 0; i < input; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
