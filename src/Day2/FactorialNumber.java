package Day2;
import java.util.Scanner;
public class FactorialNumber {
    public static void main(String []args)
    {
        Scanner d = new Scanner(System.in);
        int input = d.nextInt();
        int fact = 1;
       while(input!=0)
       {
           fact*=input;
           input--;
       }
        System.out.println(fact);
    }
}
