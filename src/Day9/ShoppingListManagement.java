package Day9;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingListManagement {

    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();

        while (true) {
            System.out.println("Choose an option:\n1. Add an item\n2. Remove an item\n3. Display shopping list\n4. Exit");
            int choice = d.nextInt();
            d.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter the item to add:");
                    String itemToAdd = d.nextLine();
                    shoppingList.add(itemToAdd);
                    System.out.println(itemToAdd + " has been added to the list.");
                    break;

                case 2:
                    System.out.println("Enter the item to remove:");
                    String itemToRemove = d.nextLine();
                    if (shoppingList.remove(itemToRemove)) {
                        System.out.println(itemToRemove + " has been removed from the list.");
                    } else {
                        System.out.println("Item not found in the list.");
                    }
                    break;

                case 3:
                    System.out.println("Shopping List: " + shoppingList);
                    break;

                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

