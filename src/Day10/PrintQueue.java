package Day10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrintQueue {
    public static void main(String[] args) {
        Queue<String> printQueue = new LinkedList<>();
        Scanner d = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add document to the queue");
            System.out.println("2. Print a document");
            System.out.println("3. Display print queue");
            System.out.println("4. Exit");

            int choice = d.nextInt();
            d.nextLine(); // Consume the newline character

            switch (choice) {
                case 1: // Add document
                    System.out.print("Enter the document name: ");
                    String document = d.nextLine();
                    printQueue.add(document);
                    System.out.println("Document added to the queue!");
                    break;

                case 2: // Print a document
                    if (!printQueue.isEmpty()) {
                        String printedDocument = printQueue.poll();
                        System.out.println("Printing document: " + printedDocument);
                    } else {
                        System.out.println("The queue is empty!");
                    }
                    break;

                case 3: // Display queue
                    if (!printQueue.isEmpty()) {
                        System.out.println("Current Print Queue: " + printQueue);
                    } else {
                        System.out.println("The queue is empty!");
                    }
                    break;

                case 4: // Exit
                    System.out.println("Exiting...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
}

