package Day3;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }   
}

class Student extends Person {
    private int rollNumber;
    private double marks;

    public Student(String name, int age, int rollNumber, double marks) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void displayStudentDetails() {
        displayPersonDetails();
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student student = new Student("Alice", 20, 101, 95.5);
        student.displayStudentDetails();
    }
}
