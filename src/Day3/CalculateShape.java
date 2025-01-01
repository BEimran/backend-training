package Day3;

abstract class CalculateShape {
    public abstract void calculateArea();
}

class Circle extends CalculateShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}

class Rectangle extends CalculateShape {
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

    public static void main(String[] args) {
        CalculateShape circle = new Circle(5);
        circle.calculateArea();

        CalculateShape rectangle = new Rectangle(4, 7);
        rectangle.calculateArea();
    }
}
