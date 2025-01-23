package Day18;

import java.util.*;
import java.util.stream.*;

class Student {
    private String name;
    private String department;
    private List<Integer> marks;
    private double average;
    private String grade;

    public Student(String name, String department, List<Integer> marks) {
        this.name = name;
        this.department = department;
        this.marks = marks;
        this.average = calculateAverage();
        this.grade = assignGrade();
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getAverage() {
        return average;
    }

    public String getGrade() {
        return grade;
    }

    private double calculateAverage() {
        return marks.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    private String assignGrade() {
        if (average >= 85) return "A";
        else if (average >= 70) return "B";
        else if (average >= 50) return "C";
        else return "D";
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Dept: %s, Avg: %.2f, Grade: %s", name, department, average, grade);
    }
}

public class StudentPerformance {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("John", "Computer Science", Arrays.asList(85, 90, 78, 92, 88)),
                new Student("Alice", "Mathematics", Arrays.asList(72, 65, 70, 60, 75)),
                new Student("Bob", "Physics", Arrays.asList(50, 55, 60, 65, 58)),
                new Student("Clara", "Computer Science", Arrays.asList(95, 93, 96, 91, 94)),
                new Student("Dave", "Mathematics", Arrays.asList(45, 40, 35, 50, 42)),
                new Student("Eve", "Physics", Arrays.asList(88, 85, 82, 84, 87)),
                new Student("Frank", "Mathematics", Arrays.asList(58, 62, 65, 55, 60)),
                new Student("Grace", "Computer Science", Arrays.asList(48, 45, 42, 50, 46))
        );
        System.out.println("Top 3 Students:");
        students.stream()
                .sorted(Comparator.comparingDouble(Student::getAverage).reversed())
                .limit(3)
                .forEach(System.out::println);
        System.out.println("\nAll Students with Grades:");
        students.forEach(System.out::println);
        System.out.println("\nAverage Marks for Each Department:");
        students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment, Collectors.averagingDouble(Student::getAverage)))
                .forEach((dept, avg) -> System.out.printf("%s: %.2f\n", dept, avg));
        System.out.println("\nTop Student in Each Department:");
        students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Student::getAverage))))
                .forEach((dept, topStudent) -> System.out.printf("%s: %s\n", dept, topStudent.orElse(null)));
        System.out.println("\nCount of Students Failed in Each Department:");
        students.stream()
                .filter(s -> s.getAverage() < 50)
                .collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()))
                .forEach((dept, count) -> System.out.printf("%s: %d\n", dept, count));
    }
}

