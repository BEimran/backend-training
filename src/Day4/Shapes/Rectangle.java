package Day4.Shapes;

public class Rectangle extends CalculateShape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
}
