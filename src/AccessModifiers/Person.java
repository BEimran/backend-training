package AccessModifiers;

public class Person {
    public String name;
    protected int age;
    String address; // Default access modifier
    private double salary;

    public Person(String name, int age, String address, double salary) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }

    public double getSalary() {
        return salary; // Provide access to private member via a public method
    }
}
