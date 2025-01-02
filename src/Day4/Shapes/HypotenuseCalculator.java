package Day4.Shapes;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class HypotenuseCalculator {
    public static void main(String[] args) {
        double sideA = 3;
        double sideB = 4;

        double hypotenuse = sqrt(pow(sideA, 2) + pow(sideB, 2));
        System.out.println("The hypotenuse of the triangle is: " + hypotenuse);
    }
}
