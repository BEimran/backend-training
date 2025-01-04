package Day6;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    public Student(Student other) {
        this.name = other.name;
        this.age = other.age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class CloneDemo {
    public static void main(String[] args) {
        Student original = new Student("John Doe", 20);
        Student clone = new Student(original); // Using the copy constructor
        original.displayDetails();
        clone.displayDetails();
    }
}


