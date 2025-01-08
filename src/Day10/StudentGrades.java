package Day10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Map<String, Integer> studentGrades = new HashMap<>();
        Scanner d = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a student's name and grade");
            System.out.println("2. Update a student's grade");
            System.out.println("3. Retrieve a student's grade by name");
            System.out.println("4. Display all students and their grades");
            System.out.println("5. Exit");

            int choice = d.nextInt();
            d.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the student's name: ");
                    String addName = d.nextLine();
                    System.out.print("Enter the grade: ");
                    int addGrade = d.nextInt();
                    studentGrades.put(addName, addGrade);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.print("Enter the student's name: ");
                    String updateName = d.nextLine();
                    if (studentGrades.containsKey(updateName)) {
                        System.out.print("Enter the new grade: ");
                        int newGrade = d.nextInt();
                        studentGrades.put(updateName, newGrade);
                        System.out.println("Grade updated successfully!");
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter the student's name: ");
                    String retrieveName = d.nextLine();
                    if (studentGrades.containsKey(retrieveName)) {
                        System.out.println(retrieveName + "'s grade: " + studentGrades.get(retrieveName));
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 4:
                    System.out.println("All students and their grades:");
                    for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
}

