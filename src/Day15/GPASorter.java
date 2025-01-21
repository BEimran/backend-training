package Day15;

import java.util.*;

class Individual {
    private String name;
    private double gpa;
    public Individual(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Individual{name='" + name + "', gpa=" + gpa + "}";
    }
}
public class GPASorter {

    public static void sortIndividualsByGpaDescending(List<Individual> individuals) {
        individuals.sort((a, b) -> Double.compare(b.getGpa(), a.getGpa())); // Sort in descending order of GPA
    }
    public static void main(String[] args) {
        List<Individual> individuals = Arrays.asList(
                new Individual("Alice", 3.9),
                new Individual("Bob", 3.5),
                new Individual("Charlie", 3.8),
                new Individual("Diana", 4.0)
        );
        System.out.println("Before sorting:");
        individuals.forEach(System.out::println);
        sortIndividualsByGpaDescending(individuals);
        System.out.println("\nAfter sorting:");
        individuals.forEach(System.out::println);
    }
}

