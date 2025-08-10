package Exercise_4_Package;

import java.util.Stack;
import java.util.Scanner;

public class Stack_Of_5_Books {
    public static void main(String[] args) {
        Stack<String> bookPile = new Stack<String>();

        bookPile.push("Рецепти на Ути Бъчваров");
        bookPile.push("Клетниците");
        bookPile.push("1984");
        bookPile.push("Малкият принц");
        bookPile.push("Под Игото");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Book Pile Manager");
            System.out.println("1. View the Pile of Books");
            System.out.println("2. Search and Retrieve a Book");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                if (bookPile.isEmpty()) {
                    System.out.println("The pile is empty.");
                } else {
                    System.out.println("Books in the pile (top to bottom):");
                    for (String book : bookPile) {
                        System.out.println(book);
                    }
                }
            }
            else if (choice == 2) {
                System.out.print("Enter the title of the book to search and retrieve: ");
                String bookToRetrieve = scanner.nextLine();

                if (bookPile.contains(bookToRetrieve)) {
                    Stack<String> tempStack = new Stack<>();
                    boolean bookFound = false;

                    while (!bookPile.isEmpty()) {
                        String topBook = bookPile.pop();
                        if (!bookFound && topBook.equals(bookToRetrieve)) {
                            System.out.println("Book '" + bookToRetrieve + "' retrieved from the pile.");
                            bookFound = true;
                        } else {
                            tempStack.push(topBook);
                        }
                    }

                    while (!tempStack.isEmpty()) {
                        bookPile.push(tempStack.pop());
                    }

                    System.out.println("Remaining books in the pile:");
                    for (String book : bookPile) {
                        System.out.println(book);
                    }
                } else {
                    System.out.println("The book '" + bookToRetrieve + "' is not in the pile.");
                }
            }
            else if (choice == 3) {
                System.out.println("Exiting Book Pile Manager. Goodbye!");
                break;
            }
            else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}