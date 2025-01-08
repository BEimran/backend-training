package Day10;

import java.util.LinkedList;
import java.util.Scanner;

public class ManageTaskLinkedList {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        LinkedList<String> vl = new LinkedList<>();

        while (true) {
            System.out.println("1. Add a task to the list");
            System.out.println("2. Remove a task from the list");
            System.out.println("3. Display all tasks in the list");
            System.out.println("4. Exit the list");
            System.out.print("Enter your choice: ");
            int n = d.nextInt();
            // Cons ume the newline character

            switch (n) {
                case 1:
                    System.out.print("Enter the task to add: ");
                    String s1 = d.nextLine();
                    vl.add(s1);
                    break;

                case 2:
                    System.out.print("Enter the task to remove: ");
                    String s2 = d.nextLine();
                    if (vl.remove(s2)) {
                        System.out.println("Task removed successfully.");
                    } else {
                        System.out.println("Task not found in the list.");
                    }
                    break;

                case 3:
                    System.out.println("Tasks in the list: " + vl);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }


    }
}
