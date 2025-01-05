package Day6;
import java.util.Scanner;
public class ExceptionHandliing {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int n1 = d.nextInt();
        int n2 = d.nextInt();

        try {
            int r = n1/n2;
            System.out.println(r);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        }
        finally {
            d.close();
        }
    }
}
