package Day3;

interface Vehicles {
    void start();
}

interface FourWheeler extends Vehicles {
    void driveFourWheeler();
}

interface TwoWheeler extends Vehicles {
    void driveTwoWheeler();
}

class Car implements FourWheeler {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void driveFourWheeler() {
        System.out.println("Driving a car...");
    }
}

class Bike implements TwoWheeler {
    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }

    @Override
    public void driveTwoWheeler() {
        System.out.println("Driving a bike...");
    }

    public static void main(String[] args) {
        FourWheeler car = new Car();
        car.start();
        car.driveFourWheeler();

        TwoWheeler bike = new Bike();
        bike.start();
        bike.driveTwoWheeler();
    }
}

