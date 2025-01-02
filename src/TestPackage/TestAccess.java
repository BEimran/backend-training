package TestPackage;

import AccessModifiers.Person;
import AccessModifiers.Employee;

public class TestAccess {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30, "123 Main Street", 50000);
        Employee ob2 = new Employee("John Doe", 30, "123 Main Street", 50000);
        System.out.println("Name: " + person.name);
        ob2.displayDetails();

        System.out.println("Salary (via method): " + person.getSalary());
    }
}
