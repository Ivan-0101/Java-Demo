package Exercise_4_Package;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_Of_Contacts {
    public static void main(String[] args) {
        LinkedList<String> contacts = new LinkedList<String>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Contact List");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contact List");
            System.out.println("3. Remove Contact");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter contact name to add: ");
                String contact = sc.nextLine();
                contacts.add(contact);
                System.out.println(contact + " added to the contact list.");
            }
            else if (choice == 2) {
                if (contacts.isEmpty()) {
                    System.out.println("Contact list is empty.");
                } else {
                    System.out.println("Contacts in the list:");
                    for (String contact : contacts) {
                        System.out.println(contact);
                    }
                }
            }
            else if (choice == 3) {
                System.out.print("Enter the contact name to remove: ");
                String contactToRemove = sc.nextLine();
                if (contacts.remove(contactToRemove)) {
                    System.out.println(contactToRemove + " removed from the contact list.");
                } else {
                    System.out.println(contactToRemove + " not found in the contact list.");
                }
            }
            else if (choice == 4) {
                System.out.println("Exiting Contact List. Goodbye!");
                break;
            }
            else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        sc.close();
    }
}