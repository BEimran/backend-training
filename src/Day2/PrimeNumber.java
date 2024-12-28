package Day2;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int input = d.nextInt(), c = 0;
        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            System.out.println("prime number");
        } else {
            System.out.println("not prime number");
        }
    }
}
