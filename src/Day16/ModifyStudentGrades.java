package Day16;

import java.util.*;
import java.util.function.*;

class GradeModifierStudent {
    String name;
    int grade;

    GradeModifierStudent(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + ": " + grade;
    }
}

public class ModifyStudentGrades {
    public static void modifyStudentGrades(List<GradeModifierStudent> students) {
        Consumer<GradeModifierStudent> increaseGrade = student -> student.grade += 10;
        students.forEach(increaseGrade);
    }

    public static void main(String[] args) {
        List<GradeModifierStudent> students = Arrays.asList(
                new GradeModifierStudent("John", 70),
                new GradeModifierStudent("Alice", 60)
        );
        modifyStudentGrades(students);
        System.out.println("Modified Student Grades: " + students);
    }
}