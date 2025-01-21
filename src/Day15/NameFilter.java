package Day15;

import java.util.*;
import java.util.stream.Collectors;

class Pupil {
    private String name;
    private double gpa;
    private String department;

    public Pupil(String name, double gpa, String department) {
        this.name = name;
        this.gpa = gpa;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pupil{name='" + name + "', gpa=" + gpa + ", department='" + department + "'}";
    }
}

public class NameFilter {

    public static List<Pupil> findPupilsByNameStartingWith(List<Pupil> pupils, char letter) {
        return pupils.stream()
                .filter(pupil -> pupil.getName().startsWith(String.valueOf(letter)))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Pupil> pupils = Arrays.asList(
                new Pupil("Alice", 3.9, "Computer Science"),
                new Pupil("Bob", 3.5, "Mathematics"),
                new Pupil("Charlie", 3.8, "Engineering"),
                new Pupil("Diana", 4.0, "Computer Science"),
                new Pupil("Albert", 3.6, "Physics")
        );

        char startLetter = 'A';
        List<Pupil> filteredPupils = findPupilsByNameStartingWith(pupils, startLetter);
        System.out.println("Pupils whose names start with '" + startLetter + "':");
        filteredPupils.forEach(System.out::println);
    }
}
