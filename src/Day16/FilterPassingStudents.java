package Day16;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

class PassingStudent {
    String name;
    int grade;

    PassingStudent(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + ": " + grade;
    }
}

public class FilterPassingStudents {
    public static List<PassingStudent> filterPassingStudents(List<PassingStudent> students) {
        Predicate<PassingStudent> hasPassingGrade = student -> student.grade > 60;
        return students.stream().filter(hasPassingGrade).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<PassingStudent> students = Arrays.asList(
                new PassingStudent("John", 75),
                new PassingStudent("Alice", 55),
                new PassingStudent("Mark", 88)
        );
        System.out.println("Students with Passing Grades: " + filterPassingStudents(students));
    }
}
