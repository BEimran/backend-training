package Day10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CustomerSupportSystem {
    public static void main(String[] args) {
        Queue<String> customerQueue = new LinkedList<>();
        Scanner d = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Choose an option:");
            System.out.println("1. Add customer to the queue");
            System.out.println("2. Serve a customer");
            System.out.println("3. Display waiting customers");
            System.out.println("4. Exit");

            int choice = d.nextInt();
            d.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the customer's name: ");
                    String customerName = d.nextLine();
                    customerQueue.add(customerName);
                    System.out.println("Customer added to the queue!");
                    break;

                case 2:
                    if (!customerQueue.isEmpty()) {
                        String servedCustomer = customerQueue.poll();
                        System.out.println("Serving: " + servedCustomer);
                    } else {
                        System.out.println("No customers in the queue!");
                    }
                    break;

                case 3:
                    if (!customerQueue.isEmpty()) {
                        System.out.println("Waiting: " + customerQueue);
                    } else {
                        System.out.println("No customers are waiting!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
}

