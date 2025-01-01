package Day3;

abstract class Appliance {
    public abstract void turnOn();

    public void turnOff() {
        System.out.println("Appliance is turned off");
    }
}

class Fan extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("Fan is turned on");
    }

    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.turnOn();
        fan.turnOff();
    }
}
