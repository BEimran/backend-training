package Day15;

import java.util.*;
import java.util.stream.Collectors;

class Learner {
    private String name;
    private double gpa;
    private String department;

    public Learner(String name, double gpa, String department) {
        this.name = name;
        this.gpa = gpa;
        this.department = department;
    }

    public double getGpa() {
        return gpa;
    }
}

public class AverageGpaCalculator {

    public static double calculateAverageGpa(List<Learner> learners) {
        // Calculate the average GPA using the Stream API
        return learners.stream()
                .mapToDouble(Learner::getGpa) // Extract GPAs as a DoubleStream
                .average() // Calculate the average
                .orElse(0.0); // Return 0.0 if the list is empty
    }

    public static void main(String[] args) {
        // Example usage
        List<Learner> learners = Arrays.asList(
                new Learner("Alice", 3.9, "Computer Science"),
                new Learner("Bob", 3.5, "Mathematics"),
                new Learner("Charlie", 3.8, "Engineering"),
                new Learner("Diana", 4.0, "Computer Science")
        );

        double averageGpa = calculateAverageGpa(learners);
        System.out.printf("The average GPA is: %.2f%n", averageGpa);
    }
}

