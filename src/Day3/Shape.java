package Day3;

class Shape {
    public void area() {
        System.out.println("Calculating area...");
    }
}

class Rectangle extends Shape {
    protected double length;
    protected double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void area() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void area() {
        System.out.println("Area of Square: " + (length * length));
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.area();

        Rectangle rectangle = new Rectangle(5, 10);
        rectangle.area();

        Square square = new Square(4);
        square.area();
    }
}

