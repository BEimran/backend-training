package Day2;
import java.util.Scanner;
import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String []args)
    {
        Scanner d = new Scanner(System.in);
        int a = d.nextInt(),b = d.nextInt();
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a);
        System.out.println(b);
    }
}
