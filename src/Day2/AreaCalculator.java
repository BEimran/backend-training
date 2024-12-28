package Day2;

class AreaCalculator {

    public double area(double length, double width) {
        return length * width;
    }

    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    public double area(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        }
        return -1;
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        double rectangleArea = calculator.area(10, 5);
        System.out.println("Area of Rectangle: " + rectangleArea);

        double circleArea = calculator.area(7);
        System.out.println("Area of Circle: " + circleArea);

        double triangleArea = calculator.area(10, 5, true);
        System.out.println("Area of Triangle: " + triangleArea);
    }
}


