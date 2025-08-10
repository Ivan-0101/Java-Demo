package Exercise_4_Package;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Of_Books {
    public static void main(String[] args) {
        Stack<String> books = new Stack<String>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Book Stack Manager");
            System.out.println("1. Add a Book to the Stack");
            System.out.println("2. View the Top Book");
            System.out.println("3. Remove a Book from the Stack");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter the book title to add: ");
                String bookTitle = sc.nextLine();
                books.push(bookTitle);
                System.out.println(bookTitle + " added to the stack.");
            }
            else if (choice == 2) {
                if (!books.isEmpty()) {
                    System.out.println("The top book is: " + books.peek());
                } else {
                    System.out.println("No books in the stack.");
                }
            }
            else if (choice == 3) {
                if (!books.isEmpty()) {
                    String removedBook = books.pop();
                    System.out.println(removedBook + " removed from the stack.");
                } else {
                    System.out.println("No books to remove.");
                }
            }
            else if (choice == 4) {
                System.out.println("Exiting Book Stack Manager. Goodbye!");
                break;
            }
            else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        sc.close();
    }
}