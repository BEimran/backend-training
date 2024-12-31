package Day3;

class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start();

        Car car = new Car();
        car.start();
    }
}

