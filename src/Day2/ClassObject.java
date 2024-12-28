package Day2;

class Car {
    private String brand;
    private String model;
    private double price;

    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

    public double calculateDiscountedPrice(double discountPercentage) {
        double discountAmount = (price * discountPercentage) / 100;
        return price - discountAmount;
    }
}
public class ClassObject {
        public static void main(String[] args) {
            Car car = new Car("Toyota", "Corolla", 20000);


            double discountPercentage = 10;
            double discountedPrice = car.calculateDiscountedPrice(discountPercentage);
            car.displayDetails();
            System.out.println(discountedPrice);
        }
    }
