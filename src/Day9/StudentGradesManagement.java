package Day9;

import java.util.Scanner;
import java.util.Vector;

public class StudentGradesManagement {

    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        Vector<Integer> grades = new Vector<>();
        String[] inputGrades = d.nextLine().split(" ");
        for (String grade : inputGrades) {
            grades.add(Integer.parseInt(grade));
        }

        System.out.println("Grades: " + grades);


        int highestGrade = Integer.MIN_VALUE;
        int lowestGrade = Integer.MAX_VALUE;
        int sum = 0;

        for (int grade : grades) {
            if (grade > highestGrade) highestGrade = grade;
            if (grade < lowestGrade) lowestGrade = grade;
            sum += grade;
        }

        double averageGrade = (double) sum / grades.size();

        System.out.println("Highest Grade: " + highestGrade);
        System.out.println("Lowest Grade: " + lowestGrade);
        System.out.printf("Average Grade: %.2f\n", averageGrade);


        System.out.println("Enter the index of the grade to remove (0-based index):");
        int indexToRemove = d.nextInt();

        if (indexToRemove >= 0 && indexToRemove < grades.size()) {
            grades.remove(indexToRemove);
            System.out.println("Updated Grades: " + grades);
        } else {
            System.out.println("Invalid index. No grade removed.");
        }
    }
}

