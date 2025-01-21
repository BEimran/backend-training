package Day15;

import java.util.*;
import java.util.stream.Collectors;

class Student {
    private String name;
    private double gpa;
    private String department;

    public Student(String name, double gpa, String department) {
        this.name = name;
        this.gpa = gpa;
        this.department = department;
    }
    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', gpa=" + gpa + ", department='" + department + "'}";
    }
}

public class TopScorerFinder {

    public static Map<String, Optional<Student>> findTopScorerByDepartment(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(
                        Student::getDepartment, // Grouping key: department
                        Collectors.maxBy(Comparator.comparingDouble(Student::getGpa)) // Finding max GPA
                ));
    }

    public static void main(String[] args) {
        // Example usage
        List<Student> students = Arrays.asList(
                new Student("Alice", 3.9, "Computer Science"),
                new Student("Bob", 3.5, "Mathematics"),
                new Student("Charlie", 3.8, "Engineering"),
                new Student("Diana", 4.0, "Computer Science"),
                new Student("Eve", 3.6, "Mathematics"),
                new Student("Frank", 3.7, "Engineering")
        );

        Map<String, Optional<Student>> topScorers = findTopScorerByDepartment(students);
        topScorers.forEach((department, student) ->
                System.out.println(department + ": " + student.orElse(null)));
    }
}
