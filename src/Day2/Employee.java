package Day2;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: $" + this.salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(101, "John Doe", 50000);
        emp.displayDetails();
    }
}
