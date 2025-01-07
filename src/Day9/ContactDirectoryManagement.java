package Day9;

import java.util.Hashtable;
import java.util.Scanner;
import java.util.Map;

public class ContactDirectoryManagement {

    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        Hashtable<String, String> contactDirectory = new Hashtable<>();



        while (true) {
            String input = d.nextLine();
            if (input.equalsIgnoreCase("done")) break;

            String[] contact = input.split("->");
            if (contact.length == 2) {
                contactDirectory.put(contact[0].trim(), contact[1].trim());
            } else {
                System.out.println("Invalid format. Use 'Name->Phone'.");
            }
        }


        for (Map.Entry<String, String> entry : contactDirectory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        String nameToSearch = d.nextLine().trim();
        if (contactDirectory.containsKey(nameToSearch)) {
            System.out.println("Search Result for " + nameToSearch + ": " + contactDirectory.get(nameToSearch));
        } else {
            System.out.println("Contact not found.");
        }

        System.out.println("Enter the name of the contact to remove:");
        String nameToRemove = d.nextLine().trim();
        if (contactDirectory.containsKey(nameToRemove)) {
            contactDirectory.remove(nameToRemove);
            System.out.println("Contact removed successfully.");
        } else {
            System.out.println("Contact not found.");
        }

        System.out.println("Updated Contact Directory:");
        for (Map.Entry<String, String> entry : contactDirectory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
