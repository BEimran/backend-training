package Day7;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int n1 = d.nextInt();
        int n2 = d.nextInt();

        try {
            int r = n1/n2;
        } catch (ArithmeticException e)
        {
            System.out.println("Division by zero is not allowed.");
        }
        catch (InputMismatchException e)
        {
            System.out.println("Invalid input. Please enter numeric values.");
        }
        catch (Exception e)
        {
            System.out.println("An error occurred: "+ e.getMessage());
        }
    }
}

