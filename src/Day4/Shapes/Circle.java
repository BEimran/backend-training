package Day4.Shapes;

abstract class CalculateShape {
    public abstract void calculateArea();
}

public class Circle extends CalculateShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}
