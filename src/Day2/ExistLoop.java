package Day2;
import java.util.Scanner;
public class ExistLoop {
        public static void main(String[] args) {
            Scanner d = new Scanner(System.in);
            while (true) {
                System.out.print("Enter a number: ");
                int number = d.nextInt();

                if (number == 0) {
                    System.out.println("You entered 0. Exiting the loop.");
                    break;
                }

                System.out.println("You entered: " + number);
            }
        }
    }
